package arrays;

public class FindMaxIdx {

	public static void main(String[] args) {
		// 최대값의 위치 찾기
		// 최대값의 위치를 0번으로 설정
		int[] arr = new int[] {10, 50, 80, 30, 100};
		int maxIdx = 0;
		
		for(int i = 1; i < arr.length; i++) {
			//if문
		if(arr[i] > arr[maxIdx]) // 값의 대소 비교
			maxIdx = i; //최대값 위치에 i를 저장
			
		}
		/*
		 	i=0			maxIdx = 
		  
		  
		  
		  
		  
		 */
		
		
		
		System.out.println("최대값의 위치 : " + maxIdx);
		
	}//m
}
