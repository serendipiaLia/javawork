package continueexam;

public class ContinueTest2 {
	
	public static void main(String[] args) {
		//1. 일반 for문 : 1~10 까지 자연수 중 홀수 만 출력
		for(int i=1; i <= 10; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n==================");
		//2. continue를 사용해서 1~10 까지 자연수 중 홀수 만 출력
		for(int i=1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	} //m
} //c
