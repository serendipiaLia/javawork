package decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputOutputStreamTest {
	
	public static void main(String[] args) {
		//정수, 실수, 문자열 쓰기
		try {
			//기반 스트림 객체 생성(상대 경로)
			OutputStream os = new FileOutputStream("data.db");
			//보조 스트림 객체 생성
			DataOutputStream dos = new DataOutputStream(os);
			
			//기본 타입 자료 쓰기
			dos.writeInt(100);	//정수형 자료
			dos.writeUTF("nagyunglee");	//문자열 자료
			dos.writeDouble(95.2);	//실수형 자료
			
			dos.writeInt(2);
			dos.writeUTF("yeeunrim");
			dos.writeDouble(88.5);
			
			dos.flush();
			dos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//바이트 데이터 읽기
		try(InputStream is = new FileInputStream("./data.db");
			DataInputStream dis = new DataInputStream(is)) {
			
			//기본 타입 자료 읽기
			int num = dis.readInt();
			String name = dis.readUTF();
			double score = dis.readDouble();
			System.out.println(num + " / " + name + " / " + score);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
