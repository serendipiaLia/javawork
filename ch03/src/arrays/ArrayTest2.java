package arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 배열의 선언 및 사용
		// 크기가 4인 cars 배열 선언
		// 문자형은 값이 비어 있으면 null 출력됨
		String [] cars = new String [4];
		
		//입력(저장)
		cars[0] = "Sonata";
		cars[1] = "Morning";
		cars[2] = "K7";
		cars[3] = "K7";
		
		//특정한 위치에 있는 (1번 인덱스) 조회
		System.out.println(cars[1]); // 출력값 Morning
		
		
		//전체조회
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		/* 
		입력부분에 cars[2]까지만 작성 후 출력하면 ,
		
		  for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		} 
		
		출력값 null이 나옴 -> 값이 없을 때 출력했기 때문
		*/
		
		
	} //m
} //c 
