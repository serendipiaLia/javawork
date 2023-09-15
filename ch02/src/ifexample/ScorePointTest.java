package ifexample;

import java.util.Scanner;

public class ScorePointTest {

	public static void main(String[] args) {
		//점수에 따른 학점 출력 프로그램
		//변수 - score(점수-정수형int), grade(학점-문자형char)
		// A학점(90~100점) | B학점(80~90점) | C학점(70~80점)
		// D학점(60~70점) | F학점(0~60점)
		
		// 객체(변수) scan생성
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		//입력
		int score = sc.nextInt();
		char grade = 'A'; //char : 한 문자(홀 따옴표)
			//== String grade = "A"; 
		
		//연산
		if(score >= 90 && score <= 100) { //true && true 
			grade = 'A';
		}else if(score >= 80 && score < 90) {
			grade = 'B';
		}else if(score >= 70 && score < 80) {
			grade = 'C';
		}else if(score >= 60 && score < 70) {
			grade = 'D';
		}else {
			grade = 'F';
		}

		//출력
		System.out.println(grade + "학점 입니다.");
		
		sc.close();
		
	} //main
}
