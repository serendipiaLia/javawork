package FunctionalInterface.calculator;

public class CalculatorTest {
	
	public static void main(String[] args) {
		// Calculator 객체 변수 선언 - add
		Calculator add, sub, mul, div; 
		int num1 = 10, num2 = 5;
		
		// calculate()를 구현 -> 람다식
		// 사칙연산 - 덧셈 구현
		add = (n1,n2) -> n1 + n2; 
		//호출
		System.out.println("덧셈 : " + add.calculate(num1, num2));
		/*	
		 	int value1 = add.calculate(num1, num2);
		  	System.out.println("덧셈 : " + value1);
		*/
		
		//뺄셈 구현
		sub = (n1,n2) -> n1 - n2;
		//호출
		System.out.println(sub.calculate(num1, num2));
		/*
		  	int value2 = sub.calculate(num1, num2);
		  	System.out.println("뺄셈 : " + value2);
		*/
		
		//곱셈 구현
		mul = (n1,n2) -> n1 * n2;
		//호출
		System.out.println(mul.calculate(num1, num2));
		/*
	  		int value3 = mul.calculate(num1, num2);
	  		System.out.println("곱셈 : " + value3);
		 */
		
		//나눗셈 구현
		div = (n1,n2) -> n1 / n2;
		//호출
		System.out.println(div.calculate(num1, num2));
		
		// calculate() 
		
	}
}
