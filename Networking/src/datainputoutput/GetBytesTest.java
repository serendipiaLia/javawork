package datainputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GetBytesTest {
	
	public static void main(String[] args) {
		//OutputStream은 문자열 쓰기를 지원하지 않지만, String클래스가 getBytes()를 지원
		//바이트 기반으로 데이터 보내기
		try (OutputStream os = new FileOutputStream("C:/File/out.txt")) {
			
			String data = "Hello!\nHave a good one :)\nThx!"; //문자열 입력 

			os.write(data.getBytes()); 
			
			os.flush(); //잔류 버퍼 비우기
//			os.close(); //프로그램이 이어질 경우 close()해주기, 요 클래스에선 삭제 ok
			
		} catch (IOException e) { //IOException e 사용으로 FileNotFound~catch문 삭제
			e.printStackTrace();
		}
	}
}
