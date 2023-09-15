package ifexample;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		// 윤년을 판정해주는 프로그램 
		// 윤년 - 4년에 1번 온다 (4의 배수 - 나머지 연산자 %)
			//윤년의 추가 조건 -  100년 단위는 윤년이 아니고, (and조건 &&
		    			  //  400년 단위는 윤년 입니다. (or조건 ||
		// 변수 - year 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요. :");
		
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " 년은 윤년 입니다.");
		}else { //나머지가 1, 2, 3이 나올 경우
			System.out.println(year + " 년은 평년 입니다.");
		} 
		
		sc.close();
		
		
	}
}
