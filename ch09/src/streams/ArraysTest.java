package streams;

import java.util.Arrays;

public class ArraysTest {
	
	public static void main(String[] args) {
		int[] num1 = {3, 1, 2, 4, 5};
		
		//Arrays.toString() : 객체 그대로(리스트형) 출력
		System.out.println(Arrays.toString(num1));
		
		//num1 요소 중 3개 복사!
		int[] num2 = Arrays.copyOf(num1, 3); //Arrays배열.copyOf복사(num1을 3개만 복사)
		System.out.println(Arrays.toString(num2));	// [3, 1, 2]
		
		//오름차순 정렬 - Arrays.sort()
		Arrays.sort(num1); //sort() 정렬!
		System.out.println(Arrays.toString(num1)); // [1, 2, 3, 4, 5]
		
	}
}
