package bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadLineWordTest {
	
	public static void main(String[] args) {
		//FileReader에 BufferedReader 보조 스트림연결
		try(BufferedReader br = new BufferedReader (
				new FileReader("word.txt"))) {
			
			//전체 데이터 읽기
			String data;
			String[] word = null; //word 객체이므로 null
				while((data = br.readLine()) != null) {
				//	System.out.println(data);
					word = data.split(" ");
				}
				System.out.println(Arrays.toString(word));
				
	/*			//주사위 숫자 랜덤 출력 연습
	  			int dice = (int)(Math.random()*6) + 1;	//주사위는 0이없으므로 +1
				System.out.println(dice); 
	*/			
				//랜덤 출력
			//	System.out.println(word.length);
				int rnd = (int)(Math.random()*word.length); 
				System.out.println(rnd); //0-9까지 실행
				System.out.println(word[rnd]); //word 내용 랜덤출력
				
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

