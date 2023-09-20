package arraytest;

public class ArrayTest {

	public static int add(int[] arr) {	 //arr : numbers {1,2,3,4}를 받음
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		
		add(numbers);
		
		System.out.println(add(numbers));
	}
}
