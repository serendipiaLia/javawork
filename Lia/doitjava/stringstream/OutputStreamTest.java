package stringstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {
	//FileOutputStream : 바이트 단위로 파일에 자료를 씁니다.
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/File/reader.txt");
			
			String data = "안녕하세요"; 
			
			os.write(data.getBytes());
			
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
