package arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 실수형 배열의 연산 
		// 크기가 5인 실수형 배열 data 선언
		// 총점 변수 - total 
		double[] data = new double[5];
		double total = 0.0; //합계 
		double average;
		
		//저장
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		//전체조회 (합계 + 평균계산)
		for(int i = 0; i < data.length; i++) {
			total += data[i];
			System.out.println(data[i]);
		}
		
		average = total / data.length;
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + average);
		
	} //m
	
} //c
