package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// Date 객체
		Date date = new Date();  //static 함수가 아님 
		System.out.println(date);  //java docs
		
		//날짜/시간 포맷 -"yyyy/MM/dd HH:mm:ss a"
		SimpleDateFormat now = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a"); 
		System.out.println(now.format(date));
		
	} //m
}
