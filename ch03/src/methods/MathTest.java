package methods;

public class MathTest {

	public static void main(String[] args) {
		// 내장 함수 - 수학(Math)
		int v1 = Math.abs(10); // 절대값 (거리) : 양수->양수, 음수->양수
		System.out.println("v1 = " + v1);

		long v2 = Math.round(5.67); // ctrl+우클릭으로 round의 return값 확인: long! 
		//round(반올림) -> 결과값 6
		System.out.println("v2 = " + v2);
		
		double v3 = Math.floor(3.31);
		System.out.println("v3 = " + v3); // 결과값 3.0
		
		//random() - 무작위 0.0 <= 범위 < 1.0
		double rand = Math.random();
		System.out.println("rand = " + rand); // 결과값 매번바뀜 
		
		//dice - 주사위(1~6)
		int dice = (int)(Math.random()*6); // 0.9*6 -> 반올림 값 5
		System.out.println(dice);
		
		// 1~ 10 까지 자연수 무작위 출력
		int number = (int)(Math.random()*10) + 1;
		System.out.println(number);
		
		
	} //m
}
