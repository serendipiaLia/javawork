package networking;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSampleEx {
	
	//1. 서버 소켓 객체 선언
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		System.out.println("=============================================");
		System.out.println("서버를 종료하려면 'q'또는 'Q'를 입력하고 Enter를 누르세요.");
		System.out.println("=============================================");
		
		startServer();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String keyboard = scanner.nextLine();
			if(keyboard.toLowerCase().equals("q"));
			break;
		}
		scanner.close();
		
		stopServer();
	}
	
	private static void startServer() {
		//3. 작업 스레드 생성
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(50002);
					System.out.println("[server] 시작");
					
					while(true) {
						System.out.println("[server] 연결 요청 대기중");
						//4.서버가 연결요청 수락하고, 클라이언트와 통신할 소켓 생성
						Socket socket = serverSocket.accept();
						
						//5. IP주소 알아내기
						InetSocketAddress isa =
								(InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("[server]" + clientIp + "의 연결 요청을 수락함");
						
						socket.close();
						System.out.println("[server]" + clientIp + "의 연결을 끊음");
					}
					
				} catch (IOException e) {
//					e.printStackTrace();
					e.getMessage();
				}
			}
		};
		thread.start();
	}
	
	private static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[server] 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
