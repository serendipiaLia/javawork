package arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 크기가 4인 정수형 배열 선언
		// 정수형은 값이 비어있으면 0을 출력
		int[] number = new int[4];
		
		//입력
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		
		//직접 초기화 방법
		// int[] number = new int[] {10, 20, 30, 0};
		
		//2번 인덱스 값 출력
		System.out.println(number[2]);
		
		System.out.println("=======================");
		
		//전체조회
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
		//합계구하는 방법 
		/*
		  int[] number = new int[4];
		  int total = 0; //합계
		  
		  number[0] = 10;
		  number[1] = 20;
		  number[2] = 30;
		  
		  for(int i = 0; i < number.length; i++) {
			total += number[i]; // 누적합계  // total = total + number[i]
			System.out.println(number[i]);
		}
		  System.out.println("합계 : " + total); // 출력값 60
		  
		 */
		
		// ** Lia > memo > practice >array 참고 (합계, 평균구하기)
		
		
	} //m
} //c
