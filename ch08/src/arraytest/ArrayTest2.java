package arraytest;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[5];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		//인덱스에 값 5와 4를 저장
		arr2[1] = 5;
		arr2[3] = 4; 
		// arr2[5] = 6; -> 5번인덱스 자리가 없어서 오류남

		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");	//1 2 3 0 0
		}
		
	}
}
