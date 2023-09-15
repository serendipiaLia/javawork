package whileexample;

public class WhileEx3 {
	
	public static void main(String[] args) {
		// 1 ~ 10 까지 출력
		// 반복 조건문 (while ~ if ~ break)
		// 변수 : i (반복할 수 있는 수) 
		int i = 0;
		
		while(true) {
			i++;  // i = i + 1 -> 1,2,3 .... 무한반복
			if(i > 10) // i++;만 선언 시, 무한반복이므로 if문 사용으로 원하는 결과값까지 선언 후 break!
				break;  
			System.out.println(i); // break후 결과값 1~10까지 출력
		}

		
	} //main
}
