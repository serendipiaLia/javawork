package datainputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) {
		// 입력 스트림 객체 생성
		try {
			InputStream is = new FileInputStream("C:/File/test2.db");
			
			byte[] data = new byte[1024]; //바이트데이터를 읽을 배열 생성 
			
			while(true) {
				int num = is.read(data); //배열을 읽은 바이트 수(크기)
				if(num == -1) break;
				for(int i=0; i<num; i++) {
					System.out.print(data[i] + " ");
				}
				System.out.println("\n배열을 읽은 바이트 수: " + num);
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
