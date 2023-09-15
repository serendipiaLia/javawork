package switchexample;

public class SwitchCaseTest3 {

	public static void main(String[] args) {
		// 사칙연산 - 산술기호
		// 변수 - num1, num2, operator
		// 2 * 3 = 6
		
		int num1 = 10;
		int num2 = 2;
		char operator = '/';	//값을 초기화 (String일때는 생략가능)
		int result = 0;	// 0으로 초기화
		
		System.out.println("======if ~ else문=============");
		
		//if ~ else문 (**switch case문을 if else문으로 고칠 때 if문에서 == 표시!)
		
		if(operator == '+') {
			result = num1 + num2;
		}else if(operator == '-') {
			result = num1 - num2;
		}else if(operator == '*') {
			result = num1 * num2;
		}else if(operator == '/') {
			result = num1 / num2;
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return; //즉시종료 
		}
		System.out.println("결과 값은 " + result + "입니다."); 
		
		System.out.println();
		System.out.println("=====switch ~ case문=============");
		
		//switch ~ case문
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
			return; // 즉시종료
		
		}

		System.out.println("결과 값은 " + result + "입니다."); 
		
	} //m
}
