package bufferedstream;

import java.util.Arrays;

public class StringMethodTest {
//split연습	
	public static void main(String[] args) {
		//charAt(), indexOf()
		String subject = "자바 프로그래밍 입문";
		
		System.out.println(subject.charAt(4));
		
		System.out.println(subject.indexOf("프"));
		
		//split() 사용 - 구분 기호(,  " "  , :)
		String[] word = subject.split(" ");
		System.out.println(Arrays.toString(word)); // [자바, 프로그래밍, 입문]
		
		System.out.println(word[0]); //자바
		System.out.println(word[1]); //프로그래밍

		//전화번호
		String phone = "010-1234-5678";
		String[] number = phone.split("-");
		System.out.println(Arrays.toString(number));
		
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		
	}//m
}
