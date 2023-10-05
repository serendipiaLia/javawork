package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ObjectInOutStreamTest {
	
	public static void main(String[] args) {
		//Member 객체를 역직렬화해서 파일에 쓰기
		//인코딩{encoding - 코드화하다(이진수)} <> 디코딩 {decoding - 코드를 푸는것(문자화)}
		//역직렬화 : 저장된 내용이나 전송받은 내용을 다시 복원하는 것
		try(OutputStream os = new FileOutputStream("object.dat");
				ObjectOutputStream oos = new ObjectOutputStream(os)) {
			
			Member m1 = new Member("son7", "손흥민");
			Product p1 = new Product("iPhone", 1500000);
			int[] number = {1, 2, 3, 4}; //정수형 배열객체
			
			//파일에 쓰기
			oos.writeObject(m1);
			oos.writeObject(p1);
			oos.writeObject(number);
			
			oos.flush();
			oos.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//객체를 역직렬화해서 파일에서 읽기
		 try(InputStream is = new FileInputStream("object.dat");
			ObjectInputStream ois = new ObjectInputStream(is)){
			 
			 Member m2 = (Member)ois.readObject();
			 Product p2 = (Product)ois.readObject();
			 int [] number2 = (int[])ois.readObject();
			 System.out.println(m2);
			 System.out.println(p2);
			 System.out.println(Arrays.toString(number2));
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}
}
