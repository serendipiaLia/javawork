package practice;
//ArrayTest3 합계와 평균구하기
public class Array {
	public static void main(String[] args) {
		
		int[] number = new int[4];
		int total = 0; //합계
		double average; //평균 구하기(평균 = 합계 / 개수)
		
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		
		for(int i = 0; i < number.length; i++) {
			total += number[i];
			System.out.println(number[i]);
		}
		
		average = total / number.length; 
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + average);
		
	} //m
	
	
}
