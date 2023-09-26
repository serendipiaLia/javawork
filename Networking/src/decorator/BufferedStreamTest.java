package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamTest {

	public static void main(String[] args) {
		String originFile = "C:/File/beach1.jpg"; // 원본파일 
		String copyFile = "C:/File/beach2.jpg"; // 사본파일
		long start, end; //시간 측정 변수
		
		//보조 스트림은 단독으로 쓸수 없음
		//기반 스트림을 생성자의 매개변수로 사용하여 쓸 수 있음
		try {
			//기반 스트림의 객체 생성
			InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile);
			
			//보조 스트림 객체 생성
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			start = System.currentTimeMillis();
			
			int data;
			while((data = bis.read()) != -1) { //byte데이터 읽음
				bos.write(data); //byte데이터 쓰기(복사)
			}
			bis.close();
			bos.close();
			
			end = System.currentTimeMillis();
			System.out.println("복사 소요 시간: " + (end-start) + "ms");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//m
}
