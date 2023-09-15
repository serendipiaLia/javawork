package whileexample;

public class WhileEx1 {

	public static void main(String[] args) {
		// while 반복문
		// 초기 값, 종료 조건, 증감값 (1증가, 1감소)
		
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		
		int i = 0; //초기 값 (없으면 진행x)
		
		while(i < 10) { //while(true) : 0 무한반복
			
			i++;
			// i = i + 1;
			
			System.out.println(i); //1, 2, 3 .....10
		}

	
	}
}
