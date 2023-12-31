package arraycopy;

public class DeepCopy {
	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3]; 
		
		array1[0] = new Book("미생1", "윤태호"); 
		array1[1] = new Book("미생2", "윤태호");
		array1[2] = new Book("미생3", "윤태호"); 
		
		//기본 생성자로 array2의 객체 생성 -> Book클래스에서 기본생성자 생성
		array2[0] = new Book();
		array2[1] = new Book();
		array2[2] = new Book();
		
		//array1을 array2에 복사 (생성자를 쓰지않고 setter,getter사용)
		for(int i =0; i<array1.length; i++) {
			array2[i].setBookName(array1[i].getbookName());
			array2[i].setAuthor(array1[i].getAuthor());
		}
		//array1(원본)의 첫째 요소 수정 booName,author
		array1[0].setBookName("아리랑1");
		array1[1].setAuthor("윤태호");
				//array2에 변경없음! ->깊은복사 특징
		
		//출력 
		System.out.println("**** array 1 출력 ****");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i].toString());
		}
		
		System.out.println("**** array 2 출력 ****");
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i].toString());
		}
		
		
	} //m
	
}
