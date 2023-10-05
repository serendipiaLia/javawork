package networking;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSampleEx {

	public static void main(String[] args) {
		
		//2. 소켓객체 생성 및 연결요청 (서버 컴퓨터, 포트번호)
		try {
			Socket socket = new Socket("localhost", 50002);
			System.out.println("[client] 연결 성공");
			socket.close();
			System.out.println("[client] 연결 해제");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
