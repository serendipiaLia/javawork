package streams;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {
	
	public static void main(String[] args) {
		//Stream 인터페이스 - 배열을 쉽고 효율적으로 처리하는 기능
		Integer[] num1 = {3, 1, 2, 4, 5};
/*		== int[] num1 = {3, 1, 2, 4, 5}; 		*/
		
		//Arrays.toString() : 객체 그대로(리스트형) 출력
		System.out.println(num1);
		System.out.println(Arrays.toString(num1)); //num1을 문자열정보[]로 표현!
		
		//오름차순 정렬 - Arrays.sort()
		Arrays.sort(num1); //sort() 정렬!
		System.out.println(Arrays.toString(num1)); // [1, 2, 3, 4, 5]
		
		//오름차순 정렬 뒤집기 (내림차순)
		Collections.reverse(Arrays.asList(num1));
		System.out.println(Arrays.toString(num1));
		
		//num1 요소 중 3개 복사!
		Integer[] num2 = Arrays.copyOf(num1, 3);   //Arrays배열.copyOf복사(num1을 3개만 복사)
		System.out.println(Arrays.toString(num2));	// [3, 1, 2] 
		
	}
}
