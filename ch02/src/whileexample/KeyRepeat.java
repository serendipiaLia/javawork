package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 'y' 키 입력 -> 출력 : "계속 반복합니다"
		// 'n' 키 입력 -> 출력 : "반복을 중단합니다."
		// y도 n도 아닌 그 이외의 키 -> 출력 : "키를 잘못 눌렀습니다."
		
		// 한 문자는 char alpha = 'y' 
		
		// ***문자열 동등 비교 함수는 equals()
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요?(y/n) : ");
			String key = sc.nextLine();
			
			if(key.equals("y") || key.equals("Y")) { //equals() : 문자가 일치하는지 비교
				System.out.println("계속 반복합니다.");
			}else if(key.equals("n") || key.equals("N")) {
				System.out.println("반복을 중단합니다.");
				break;
			}else {
				System.out.println("키를 잘못 눌렀습니다.");
			}
				
		}

		sc.close();
		
	}
}
