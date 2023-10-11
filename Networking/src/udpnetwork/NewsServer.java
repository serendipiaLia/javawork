package udpnetwork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class NewsServer {
	
	//필드
	private static DatagramSocket datagramSocket;
	
	public static void main(String[] args) {
		System.out.println("=============================================");
		System.out.println("서버를 종료하려면 'q'또는 'Q'를 입력하고 Enter를 누르세요.");
		System.out.println("=============================================");
		
		//UDP 서버 시작
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
			
	} //m
	
	public static void startServer() {
		//작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					// UDP통신 객체 생성
					datagramSocket = new DatagramSocket(8100);
					System.out.println("[server] 시작");
					
					while(true) { // 무한 대기
						//클라이언트가 보낸 뉴스 주제 받기
						DatagramPacket receivePacket = 
								new DatagramPacket(new byte[1024], 1024);
						datagramSocket.receive(receivePacket);
						
						//받은 주제를 문자열 복원
						String newsKind = new String(receivePacket.getData(), 0,
								receivePacket.getLength(), "utf-8");
						
						//주제 관련 뉴스 10개를 클라이언트로 전송
						//클라이언트의 IP와 port를 얻음(가져옴)
						SocketAddress socketAddress = receivePacket.getSocketAddress();
						for(int i=1; i<=10; i++) {
							String data = newsKind + ": 뉴스" + i;
							byte[] bytes = data.getBytes("utf-8");
							DatagramPacket sendPacket = new DatagramPacket(bytes, 0,
									bytes.length, socketAddress);
							datagramSocket.send(sendPacket);
						} //for
					} //while
					
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("[server]" + e.getMessage()); // Socket closed
				}
			}
		}; //thread
		thread.start();
	} // startServer
	
	public static void stopServer() {
		datagramSocket.close();
		System.out.println("[server] 종료");
	} // stopServer


}
