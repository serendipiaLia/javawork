package arraycopy;

public class Book {
	 String bookName;
	 String author;
	 
	 public Book() {}  //DeepCopy 에서 사용할 기본생성자 
	 
	 public Book(String bookName, String author) {	 //매개변수 bookName, author
		 this.bookName = bookName;
		 this.author = author;
	 }
	 
	 public String getbookName() {
		 return bookName;
	 }
	 public void setBookName(String bookName) {
		 this.bookName = bookName;
	 }
	 
	 public String getAuthor () {
		 return author;
	 }
	 public void setAuthor(String author) {
		 this.author = author;
	 }
	 
	 //to String으로 객체의 문자열 정보 재정의
	 
	 @Override
	 public String toString() {	 //toString()은 object class
		 return bookName + ", " + author;
	 }
	 
	 
	 
}
