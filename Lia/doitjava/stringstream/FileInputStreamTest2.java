package stringstream;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		//바이트 기반스트림 쓰기
		try {
			FileReader reader = new FileReader("C:/File/reader.txt");
			int data;
			while((data = reader.read()) != -1 ) {
				System.out.print((char)data);
			}
			
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
