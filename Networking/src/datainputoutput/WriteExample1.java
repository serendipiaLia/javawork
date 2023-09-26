package datainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
//byte단위로 파일쓰기
public class WriteExample1 {

	public static void main(String[] args) {

		try {
			//출력 스트림 객체 생성
			OutputStream os = new FileOutputStream("C:/File/test1.db");
			
			//데이터 변수 선언
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			//db 파일에 데이터 쓰기 : write()
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush(); //내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
			os.close();	//출력 스트림을 닫아서 사용한 메모리를 해제
			
			} catch (FileNotFoundException e) { // 파일이 없어도 정지나 ,다운이 되지 않음 -> try catch!
				e.printStackTrace();
			} catch (IOException e) { //IOException : 부모
				e.printStackTrace();
			}
	}
}
