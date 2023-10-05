package newwork.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
	
	//서버 소켓 객체 선언
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		System.out.println("=============================================");
		System.out.println("서버를 종료하려면 'q'또는 'Q'를 입력하고 Enter를 누르세요.");
		System.out.println("=============================================");
		
		//TCP 서버 시작
		startServer();

		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine(); // key = 키보드 q,Q키
			if(key.toLowerCase().equals("q")); //toLowerCase() : 대문자를 소문자로, 소문자를 대문자로 
				break;
		}
		
		scanner.close();
		
		//TCP 서버 종료
		stopServer(); 
			
	}
	
	private static void startServer() {
		// 작업 스레드 생성
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(50001);
					System.out.println("[server] 시작");
					
					while(true) {
						System.out.println("[server] 연결 요청 대기중");
						// 서버가 연결 요청 수락함
						Socket socket = serverSocket.accept(); // 클라이언트와 통신할 소켓 생성
					
						// IP주소 알아내기
						InetSocketAddress isa = 
								(InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("[server]" + clientIp + "의 연결 요청 수락");
						// 웹 브라우저에서 http://192.168.20.62:50001/ 을 입력함 
						
						//클라이언트가 보낸 데이터 받기(읽기) : InputStream
						InputStream is = socket.getInputStream();
						byte[] bytes = new byte[1024]; // 데이터 저장할 배열 선언
						int readBytes = is.read(bytes);
						//데이터를 문자열로 생성 - 디코딩 (우리가 알아볼 수 있는거)
						String message = new String(bytes, 0, readBytes, "utf-8");
						
						// 받은 데이터 보내기
						OutputStream os = socket.getOutputStream();
						bytes = message.getBytes("utf-8"); //인코딩해서 보냄(컴퓨터가 알아볼수있게..코드화)
						os.write(bytes);
						
						os.flush();
						System.out.println("[server] client에게 받은 데이터를 다시 보냄 : " + message);
						
						socket.close(); // socket 종료
						System.out.println("[server]" + clientIp + "의 연결 해제");
					}
				} catch (IOException e) {
				//	e.printStackTrace();
					System.out.println("[server]" + e.toString());
				}
			}
		};
		thread.start(); // 서버 스레드 시작
		
	} // startServer() 끝
	
	private static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[server] 종료");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
