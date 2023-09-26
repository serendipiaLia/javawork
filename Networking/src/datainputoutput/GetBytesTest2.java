package datainputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GetBytesTest2 {
	
	public static void main(String[] args) {
		//바이트 기반에서 데이터 받기 (문자열 읽기)
		try (InputStream is = new FileInputStream("C:/File/out.txt")) {
			byte[] data = new byte[1024]; //1KB
			int readBytes = is.read(data); //읽은 byte수
			
			//읽은 바이트를 문자열로 생성
			String str = new String(data, 0, readBytes, "utf-8"); 
			System.out.println(str);
			
//			is.close(); -> try문 생략
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
