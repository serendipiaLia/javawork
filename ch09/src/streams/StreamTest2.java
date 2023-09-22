package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		System.out.println("======= 문자형 배열 ========");
		// 문자형 배열
		String[] fruit = {"사과", "배", "수박", "파인애플"};
		
		// for문을 사용하지 않고 forEach()문 사용 -> stream 객체를 얻어야함
	/*	
	  	Stream<String> strStream =  Arrays.stream(fruit); // fruit 배열객체이므로 ""사용 x
		strStream.forEach(str -> System.out.println(str));
	*/	
		Arrays.stream(fruit).forEach(str -> System.out.println(str));
		
		System.out.println("====== 정수형 배열 =======");
		// 정수형 배열
		int[] number = {1, 2, 3, 4};
	/*	
	  	Stream<Integer> numStream = Arrays.stream(number);
		numStream.forEach(n -> System.out.println(n)); //람다식에서 변수 n 하나이므로 {} 생략
	 */
		Arrays.stream(number).forEach(n -> System.out.println(n)); // 위에 식을 한줄로 표현
		
		//합계, 개수, 평균 구하기
		int sumVal = Arrays.stream(number).sum(); //sum()사용시, 정수 자료형 int 
		//count()의 반환형이 long 이므로 int로 강제 다운캐스팅 함
		int count = (int)Arrays.stream(number).count(); 
		//평균은 공식함수가 없으므로 공식으로 구하기! 
		double average = (double)sumVal / count; //하나만 형 바꿔줘도 다 바뀜 -> double로 맞추기
		
		System.out.println("합계 : " + sumVal);
		System.out.println("개수 : " + count);
		System.out.println("평균 : " + average);
	}
}
