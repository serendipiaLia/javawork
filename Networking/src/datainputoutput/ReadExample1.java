package datainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) {
		//입력 스트림 객체 생성
		try {
			InputStream is = new FileInputStream("C:/File/test1.db");
			while(true) {
				int data = is.read();
				if(data == -1) break; // -1 : 데이터의 끝! (파일의 끝에 도달했을 때 루프를 종료하는 조건으로 사용)
				System.out.println(data);
			}
			is.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			
			} catch (IOException e) {
				e.printStackTrace();
		}	
	}
}
