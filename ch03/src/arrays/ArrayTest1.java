package arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		//변수
		String car1 = "Sonata";
		String car2 = "Morning";
		String car3 = "K7";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println("=====================");
		
		//배열 - 순서가 있음 , 같은 데이터 중복 가능 ex)cars에 k7, k7중복입력 ok
		// 직접 저장 : 중괄호{} 사용
		String[] cars = {"Sonata", "Morning", "K7", "K7"}; // 순서 0(sonata),1(morning),2(K7)
		    //String[] cars = new String[] {"Sonata", "Morning", "K7"};
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		
		System.out.println("=====================");
		
		//배열의 크기(개수) - 배열이름.length **암기
		
		System.out.println("배열의 크기 : " + cars.length);
		
		//for문 - 전체 조회 (for문 종료값에 인덱스 cars.length 대입 || 4 대입-배열의크기)
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]); // 0, 1, 2, 3

				/* ==
			 		System.out.println(cars[0]);
			 		System.out.println(cars[1]);
			 		System.out.println(cars[2]); 
			 		System.out.println(cars[3]); 
				 */	
			
		}
		
		
	} //m
} //c
