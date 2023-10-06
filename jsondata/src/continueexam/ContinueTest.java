package continueexam;

public class ContinueTest {

	public static void main(String[] args) {
		//1. break문 - 1~10 까지 자연수 중 1~5까지 출력
		for(int i=1; i <= 10; i++) {
			if(i > 5) {
				break;
			}
			System.out.println(i);
		}
		
		//2. continue문 - 1~10까지 자연수 중 5를 제외한 수 출력
		//반복하다가 continue를 만나면 이후의 코드를 실행하지 않고, 조건식이나 증감식을 수행
		for(int i=1; i <= 10; i++) {
			if(i == 5 || i == 8) { // 5나 8제외 후 출력
				continue;
			}
			System.out.println(i); //19행 출력문 출력시, 11행 주석처리
		}
	
	} //m
} //c
