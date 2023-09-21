package arraytest;

public class ArrayTest {

	public static int add(int[] arr) {	 //arr : main의 numbers{1,2,3,4}를 받음
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		
		int result = add(numbers); //add함수 호출할때 매개변수로 배열을 전달함
	//	add(numbers);
		
		System.out.println(result);
	}
}
