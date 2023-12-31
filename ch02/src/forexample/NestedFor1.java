package forexample;
/*단일 for문 
			  for(int i=1; i<=5; i++) 
			  System.out.print('*');
 */

public class NestedFor1 {
	public static void main(String[] args) {
		// 중첩 for문
		// 5행 5열에 '*'출력
		
		for(int i=1; i<=5; i++) {   //행
			for(int j=1; j<=5; j++) {    //열
				System.out.print('*'); 
			}
			System.out.println(); //한줄띄기
		}
		
		/*
			i=1	 j=1	*
			 	 j=2	**
			 	 j=3	***
			 	 j=4	****
			 	 j=5	*****
			i=2  j=1	*
			 	 j=2	**
			 	 j=3	***
			 	 j=4	****
			 	 j=5	*****
			i=3  ***** 	 	 
			i=4  ***** 	 	 
			i=5  ***** 	 	 
		 */
		
		//삼각형 모양1 - 행의 변화는 없고 열이 행 증가때마다 1씩 증가
		 /*
		  
		  *
		  **
		  ***
		  ****
		  *****
		  
		  for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print('*'); 
			}
			System.out.println(); //한줄띄기
		  
		  */
		System.out.println(); //한줄띄기

		for(int i=1; i<=5; i++) { 
			for(int j=1; j<=i; j++) {
				System.out.print('*'); 
			}
			System.out.println(); //한줄띄기
		}
		
		System.out.println(); //한줄띄기
		
		//삼각형 모양2 - 행의 변화는 없고 열이 행 증가때마다 1씩 감소
		 /*
		  
		  *****
		  ****
		  ***
		  **
		  *
		  
		  */
		
		 for(int i=1; i<=5; i++) {
			 for(int j=1; j<=6-i; j++) {
				 System.out.print('*');
			 }
			 System.out.println();
		 }
		
		 System.out.println(); //한줄띄기
		 //----------------------------------------
		 
		 for(int i=1; i<=5; i++) {
			 for(int j=5; j>=i; j--) {
				 System.out.print('*');
				// System.out.println("i = " + i + ", j = " + j);
			 }
			 System.out.println();
		 }
		 
		 
	} //m
	
}
