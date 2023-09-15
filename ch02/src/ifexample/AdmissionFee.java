package ifexample;

import java.util.Scanner;

public class AdmissionFee {

	public static void main(String[] args) {
		//놀이공원 입장료 계산
		//금액 : 취학 전 아동 1000 / 초등 2000 / 중고등 2500 / 일반 3000
		// 변수 - 나이(age), 입장료(fee)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		
		int age = scan.nextInt(); //나이 콘솔에서 입력받음 
		int fee; //fee 선언 후 아래에서 값 대입
		
		if(age < 8) {
			fee = 1000;
			System.out.println("취학 전 아동입니다.");
			
		}else if(age >= 8 && age < 14) {
			fee = 2000;
			System.out.println("초등학생입니다.");
			
		}else if(age >= 14 && age < 20) {
			fee = 2500;
			System.out.println("중고등학생입니다.");
			
		}else {
			fee = 3000;
			System.out.println("일반 입니다.");
		
			System.out.println("입장료는 "  + fee + "원 입니다."); //최종 문구
		}
		
		scan.close();
		
	} // main 함수 끝
}
