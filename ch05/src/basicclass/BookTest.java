package basicclass;

public class BookTest {

	public static void main(String[] args) {
		
		Book book1 = new Book(100, "개미");
		
											  //메서드 재정의 없이 book1출력하면,
		System.out.println(book1.toString()); //객체의 이름과 주소 basicclass.Book@7c30a502
		// == String msg = "개미";
		String msg = new String("개미");	
		System.out.println(msg.toString()); 
	}

	

}
