package streams.book;

public class Book {
	//필드
	private String name;
	private int price;
	
	//생성자
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//getter
	public String getName() {
		return name;
		}
	
	public int getPrice() {
		return price;
	}
}
