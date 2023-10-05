package bufferedstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteWordTest {
	
	public static void main(String[] args) {
		// 파일에 Word문자열 쓰기
		try {
			Writer writer = new FileWriter("word.txt");
			
			//문자열 쓰기
			String data = "ant bear chicken cow eagle elephant horse "
					+ "monkey penguin tiger";
			writer.write(data); 
			writer.flush();
			
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
