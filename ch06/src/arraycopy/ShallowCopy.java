package arraycopy;
// 얕은 복사 - 원본을 수정하면, 사본도 수정
public class ShallowCopy {
	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3]; 
		
		array1[0] = new Book("미생1", "윤태호"); 
		array1[1] = new Book("미생2", "윤태호");
		array1[2] = new Book("미생3", "윤태호"); 
		
		//array1의 첫번째 요소 수정
		array1[0].setBookName("아리랑1");
		array1[1].setAuthor("윤태호");
		
		System.out.println("**** array 1 출력 ****");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i].toString());
		}
		
		//array1 배열복사 -> array2 입력
		for(int i=0; i<array1.length; i++) {
			array2[i] = array1[i];
		}
		//array2 출력 
		System.out.println("**** array 2 출력 ****");
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i].toString());
		}
		
		System.out.println("===============================");
		//clone() 배열복사
		Book[] array3 = array2.clone();
		for(int i=0; i<array3.length; i++) {
			System.out.println(array3[i].toString());
		}
		
		//향상 for문
		//for(자료형 변수 : 배열이름) {변수 출력}
		for(Book arr3 : array3) {
			System.out.println(arr3.toString()); 
			// == System.out.println(arr3);
		}
		
	} //m
	
	
}
