package typinggame;

import java.util.Scanner;

public class TypingGame {
	
	public static void main(String[] args) {
		// 영어 단어 랜덤하게 화면에 출제되면 타이핑하기!
		// 오타가 없으면 "통과", 오타가 있으면 "다시도전"
		// 10문제 수행
		// 시간 측정
		
		String[] words = {"ant", "bear", "chicken", "dog",
				"elephant", "fox", "giraffe", "horse", "monkey",
				"lion", "tiger", "zebra", "panda", "cow", "cat", "pig"};
		//	System.out.println(words.length); // words 수 
		
		Scanner sc = new Scanner(System.in);
		int n = 1; //문제번호
		double start, end;
		System.out.println("영어타자 게임, 준비되면 Enter");
		sc.nextLine(); //엔터
		start = System.currentTimeMillis(); // 시작 전 시간
		
		
		while(n < 11) { //10문제 수행하면 빠져나오기
		
			int rand = (int)(Math.random()*words.length);
			System.out.println("문제" + n);
			String question = words[rand];
			System.out.println(question); // 출제된 단어
			
			//단어 입력
			String answer = sc.nextLine(); // 사용자 입력
			
			if(question.equals(answer)) { //.equals 문자열 동등비교!
				System.out.println("통과!");
				n++;	// 다음 문제 출제
			}else {
				System.out.println("오타! 재도전 하세용!");
			}
		}// while
		end = System.currentTimeMillis(); // 게임 끝낸 시간
		System.out.printf("게임 진행 시간은 %.2f초 입니다.\n", (end-start)/1000);
		sc.close();
	}
}
	

