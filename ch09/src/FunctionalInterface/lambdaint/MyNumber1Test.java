package FunctionalInterface.lambdaint;

public class MyNumber1Test {
	
	public static void main(String[] args) {
		
		MyNumber1 number; //인터페이스형 변수 선언
		
		//변수에 람다식 저장
		//람다식으로 calculate() 구현함
	/*	number = (x) -> { 
			x = x + 10;	//더하기 계산 
			System.out.println(x);
		};
	*/	
		//매개변수가 1개인 경우 중괄호 생략 가능 (매개변수 : x)
		number = x -> System.out.println(x+10);
		
		//calculate() 호출
		number.calculate(1); 
		
		System.out.println("==== 어떤 수를 제곱하는 함수 구현 =====");
		//어떤 수를 제곱하는 함수 구현
		number = n -> System.out.println(n*n);
		
		number.calculate(2);
	}

}
