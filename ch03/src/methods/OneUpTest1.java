package methods;

public class OneUpTest1 {

	// 1 증가하는 함수 정의
	// 지역변수의 생명주기(scope) - 함수나 제어문의 블럭안에서 생성되고, 호출된 뒤 소멸
							
	public static int oneUp() {
		int x = 1; // 지역변수
		x++; // 다른언어에서 : x += 1
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(oneUp()); // 2번이상 출력해도 같은 값 2 출력! ==scope
		System.out.println(oneUp()); 
		
		// x 선언 시, int x = 10; 선언 후 아래 명령어 쓰면 출력 가능 
		//System.out.println(x); -> 요것만 쓰면 출력 안됨 , x는 선언되지 않은 변수
		
		
	}
	
	
}
