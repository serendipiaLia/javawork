package interfaceex.calculator;

public class MyCalculator implements Calculator{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		//분모를 0으로 나눌수 없음
		//상수는 인터페이스나 클래스 이름으로 직접 접근
		if(num2 != 0) {
			return num1 / num2;
		}else {
			return Calculator.ERROR;	//구성요소에 상수가 들어감 에러처리를 상수로 함
		}
	}
}
