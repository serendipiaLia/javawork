package methods;

public class MathTest2 {

	public static void main(String[] args) {
		
		// 주사위 10번 던지기
		for(int i=1; i <=10; i++) {
			int dice = (int)(Math.random()*6) + 1;
			System.out.println(dice);
		}
		
		System.out.println("=============================");
		
		// 배열에서 문자열 랜덤 추출
		String[] word = {"나", "너", "우리", "나라"};
		
		int idx = (int)(Math.random()*word.length); // 0~3까지 나옴 -> 상수 4 말고 word.length입력
		System.out.println(idx);  // 인덱스 자리
		System.out.println(word[idx]); // 인덱스 자리에 있는 word 출력
		
	} //m
}
