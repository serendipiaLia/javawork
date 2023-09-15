package ifexample;

public class MaxNumber {

	public static void main(String[] args) {
		// 두 수 중 큰 값을 찾는 프로그램
		// 변수 - n1, n2, max
		int n1 = 10;
		int n2 = 20;
		int max; // max : 한글로 가능(최대값)
		
		//**연산1. if ~ else 구문
		if(n1 >= n2) {  // == if( n1 > n2 || n1 == n2)  **|| (또는) : 논리연산자
			max = n1;
		}else { //n1 < n2
			max = n2;
		}
		
		//출력
		System.out.println("두 수 중 큰 값은 " + max + "입니다."); 
											//max 한글로 했을때 + "입니다." 추가
		
		System.out.println("======조건연산자======");
		
		//**연산2. 조건 연산자 
		int max1 = (n1 >= n2) ? n1 : n2; 
		
		//출력
		System.out.println("두 수 중 큰 값은 " + max1 + "입니다.");
		
		
	}
}
