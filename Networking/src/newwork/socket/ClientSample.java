package newwork.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSample {

	public static void main(String[] args) {
		try {
			// Socket 객체 생성 및 연결 요청(서버 컴퓨터, 포트번호)
			Socket socket = new Socket("localhost", 50001);
			System.out.println("[Client] 연결 성공");
			
			socket.close();
			System.out.println("[Client] 연결 해제");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
