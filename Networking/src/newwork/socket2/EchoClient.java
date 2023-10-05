package newwork.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String[] args) {
		try {
			// Socket 객체 생성 및 연결 요청
			Socket socket = new Socket("localhost", 50001);
			System.out.println("[client] 연결 성공");
			
			//데이터 보내기
			String sendMessage = "오늘도 즐거운 하루 되세요!";
			OutputStream os = socket.getOutputStream();
			byte[] bytes = sendMessage.getBytes("utf-8"); //인코딩 (컴퓨터 용어로 나타냄)
			os.write(bytes);
			
			os.flush();
			System.out.println("[client] 데이터 보냄 : " + sendMessage);
			
			//server가 보낸 데이터 받기
			InputStream is = socket.getInputStream();
			bytes = new byte[1024];
			int readBytes = is.read(bytes);
			String receiveMessage = new String(bytes, 0, readBytes, "utf-8");
			System.out.println("[client] 데이터 받음 : " + receiveMessage);
			
			socket.close();
			System.out.println("[Client] 연결 해제");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
