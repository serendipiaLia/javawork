package datainputoutput;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// 문자열 전송 GetBytesTest Reader로 읽기
public class StringReadTest {

	public static void main(String[] args) {
		// 문자 기반으로 데이터받기(읽기)
		try (Reader reader = new FileReader("C:/File/out.txt")) {
		
		/*	while(true) {
				int data = reader.read(); 
				if(data == -1) break;
				System.out.print((char)data); 
		*/	
			//교재 방식으로 ..
			int data;
			while((data = reader.read()) != -1) {
				System.out.println((char)data);
			}
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	} //m
}
