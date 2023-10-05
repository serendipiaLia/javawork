package kr.or.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	//1.필드 - 서버 소켓 객체 선언
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		System.out.println("=============================================");
		System.out.println("서버를 종료하려면 'q'또는 'Q'를 입력하고 Enter를 누르세요.");
		System.out.println("=============================================");
		//서버시작
		startServer();
		
		//3.스레드 만든 후, 스캐너로 종료하기 만들기
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) { //toLowerCase() : 대문자를 소문자로, 소문자를 대문자로
				break;
			}
		}
		scanner.close();
		//10. 서버종료
		stopServer();
		
	} //m

	public static void startServer() {
		//2. 항상 대기 - 스레드 만들기
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(8000);
					System.out.println("[server] 시작");
					
					//5.항상 클라이언트 연결 대기
					while(true) {
						System.out.println("\n[server] 연결 요청 대기중\n");
						//6.연결 수락 및 클라이언트와 통신할 소켓 객체 생성
						Socket socket = serverSocket.accept(); 
						
						//7. IP확인
						InetSocketAddress isa = 
								(InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString(); // ip반환 getHostString();ㅅㅏ용
						System.out.println("[server]" + clientIp + "의 연결 요청을 수락함.");
						
						//12. 데이터 받기(수신) (while문안에서 진행! 데이터 주고받기)
						InputStream is = socket.getInputStream();
							//기반스트림을 생성자의 매개변수로 연결
						DataInputStream dis = new DataInputStream(is);
						String message = dis.readUTF();
						System.out.println("[server] 데이터를 받음 : " + message);
						
						//13. 데이터 보내기(송신)
						String message2 = "서버가 글을 보냅니다.";
				/*		OutputStream os = socket.getOutputStream();
						DataOutputStream dos = new DataOutputStream(os); //os를 생성자로 넣지 않고
				*/
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message2);
						dos.flush();
						System.out.println("[server] 데이터를 보냄 : " + message2);
						
						//8. IP연결끊기
						socket.close();
						System.out.println();
						System.out.println("[server]" + clientIp + "의 연결을 끊음.");
						
					} //while
				} catch (IOException e) {
					//e.printStackTrace();
					e.getMessage();
				}
			}
		}; // Thread끝 {};중괄호 끝에 ;붙이기! Thread는 run을 구현해야함!
		thread.start();
	}

	//9. 서버 종료
	 public static void stopServer() {
		 try {
			serverSocket.close();
			System.out.println("[server] 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
} //C
