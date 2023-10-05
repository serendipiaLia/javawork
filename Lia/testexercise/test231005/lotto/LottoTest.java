package test231005.lotto;

import java.util.Arrays;

public class LottoTest {
	
	public static void main(String[] args) {
		//로또번호 1~45 -> 6개 생성 
		
		// 배열의 크기 6개인 lotto 선언
		int[] lotto = new int[6]; /* 크기가 6인 정수배열 lotto를 선언, 로또번호 저장하기 위한 용도*/
		
		lotto[0] = (int)(Math.random()*45+1); //Math.random()함수는 lotto배열의 첫번째 요소 lotto[0]부터 45사이 정수 할당
		System.out.println(lotto[0]); // random 1자리가 나오므로 [0]인덱스에 숫자 랜덤으로 나옴
		
		//6개 번호 동시생성
		for(int i=0; i<lotto.length; i++) { // i는 0부터 시작, lotto배열의 크기(6) 반복
			lotto[i] = (int)(Math.random()*45+1);
			// 번호 중복문제 해결 (중첩for)
			for(int j=0; j<i; j++) { // j는 0부터 i보다 작은값까지 반복 -> 현재 생성된 번호와 이전에 생성된 번호 비교
				if(lotto[i] == lotto[j]) 
					i--; //이전 인덱스로 이동 -> 중복된 번호가 발견되면 i를 하나 줄여서 이전 인덱스로 이동 (번호 중복방지)
			}
		}
		//6개 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	
		System.out.println( );
		
		//파일 이름 출력
		LottoTest lottotest = new LottoTest();
		System.out.println(lottotest); //주소값
		System.out.println(Arrays.toString(lotto)); //Arrays 클래스사용, import 후 배열을 문자열로 출력
	}
}
