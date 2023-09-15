package whileexample;

public class WhileEx2 {
	public static void main(String[] args) {
		// 1부터 10까지의 합계
		// 변수 - n, sum
		int n = 0;
		
		/* n += 1; // 1
		n += 2; // 3
		n += 3; // 6 
		*/
		int sum = 0;
		
		while(n < 10) {
			n++;
			sum += n;  // sum = sum + n 
			System.out.println("n=" + n + " , sum=" + sum); //결과값 대각선 오른쪽 위로 덧셈 증가
		 
		}
		
		System.out.println("합계 : " + sum);
		
	}
	
}
