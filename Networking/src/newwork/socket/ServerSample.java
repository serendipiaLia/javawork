package newwork.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//TCP(Transmission Control Protocol) 네트워킹
public class ServerSample {
	
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
					
					while(true) { // 항상 대기
						System.out.println("[server] 연결 요청 대기중");
						// 서버가 연결 요청 수락함
						Socket socket = serverSocket.accept(); // 클라이언트와 통신할 소켓 생성
					
						// IP주소 알아내기
						InetSocketAddress isa = 
								(InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("[server]" + clientIp + "의 연결 요청을 수락함");
						// 웹 브라우저에서 http://192.168.20.62:50001/ 을 입력함 
						
						socket.close();
						System.out.println("[server]" + clientIp + "의 연결을 끊음");
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
