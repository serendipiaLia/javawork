package test231005.datainoutput;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClientEx {
	
	public static void main(String[] args) {
		/* 5. 서버에 연결 요청 및 객체 생성 */
		try {
			Socket socket = new Socket("localhost" , 9001);
			System.out.println("[client] 연결 성공");
	
			
			
		} catch (UnknownHostException e) { //host컴퓨터 이름이 잘못 될 경우 추적
			e.printStackTrace();
		} catch (IOException e) {	// port번호에 에러 발생할 경우 추적
			e.printStackTrace();
		} //import 후 try catch
	}
}
