package decorator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
	
	public static void main(String[] args) {
		// 파일에 문자열 쓰기 - Writer -> Filewriter
		try {
			Writer writer = new FileWriter("message.txt");
			
			//문자열 쓰기
			String msg = "Have a good one!\nGod bless U\nThx-!\ndear Lia :)";
			writer.write(msg); //msg 변수에 문자열 담기
			writer.flush();
			
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
