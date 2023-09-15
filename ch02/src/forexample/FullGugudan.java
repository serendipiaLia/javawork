package forexample;

public class FullGugudan {

	public static void main(String[] args) {
		//구구단 전체출력
		for(int i=2; i<=9; i++) { //단(행)
			for(int j=1; j<=9; j++) {
			System.out.println(i + " x " + j + " = " + (i * j));	
			}
			System.out.println();
		}
		
		
		System.out.println("=========================");
		// 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		/*
			2 x 1 = 2
		 	2 x 2 = 4
		 	
		 	3 x 1 = 3
		 	3 x 2 = 6
		 	3 x 3 = 9
		 */
		
		
		for(int i=2; i<=9; i++) { //단(행)
			for(int j=1; j<=i; j++) {
			System.out.println(i + " x " + j + " = " + (i * j));	
			}
			System.out.println();
		}
		
		
	} //m
	
}
