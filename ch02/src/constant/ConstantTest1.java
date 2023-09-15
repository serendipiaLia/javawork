package constant;

public class ConstantTest1 {

	public static void main(String[] args) {
		// **상수 선언 및 사용 
		// 상수 : 진리, 공식, 변하지 않고 항상 일정한값 **final 키워드 사용!
		
		// int maxNum = 100;  : 변수
		final int MAX_NUM = 100; //상수
		// MAX_NUM = 1000; 상수는 변경할 수 없음
		
		System.out.println(MAX_NUM);
		
		// 원의 넓이 = 반지름 * 반지름 * 원주율(PI 3.14..)
		// 변수 : 반지름 radius, circleArea(원의넓이) 
		// 상수 : PI
		
		int radius = 5;
		final double PI = 3.14;
		double circleArea;
		
			// PI 값 수정 불가! (상수 이므로)
		circleArea = radius * radius * PI;
		
		System.out.println("원의 넓이 : " + circleArea);
		
		
		
		
		
	} //m
}
