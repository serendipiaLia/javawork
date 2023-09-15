package ifexample;

public class LimitSpeedTest {

	public static void main(String[] args) {
		// if문
		// 제한 속도(limit speed) 50이면 "제한 속도 위반"
		
		/* 
		  if (비교문) {   //비교문이 true이면 실행문이 작동함
		  	실행문;
		  	}
		 */

		int limitSpeed = 45; //50이상 대입 시, if문 실행됨!
		
		if(limitSpeed >= 50) {
			System.out.println("제한 속도 위반! 과태료 10만원 부과대상!");
		}
		
		System.out.println("시속 " + limitSpeed + "km 입니다.");
		
		System.out.println("==================================");
		
		//**** if ~ else 구문

		/*
		  if (비교문) {   //비교문이 true이면 실행문이 작동함
		  	실행문2;
		  	}else{  //false이면, 실행문 작동
		  	
		  	 }
		 */
		
		int limitSpeed2 = 45; //
			
		if(limitSpeed2 >= 50) {
			System.out.println("제한 속도 위반! 과태료 10만원 부과대상!");
		}else {
			System.out.println("안전 속도 준수!");
		}
		
		System.out.println("시속 " + limitSpeed2 + "km 입니다.");
	
	}
}
