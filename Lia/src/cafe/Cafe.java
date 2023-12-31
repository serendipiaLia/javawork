package cafe;

// 클래스의 3요소 : 필드, 생성자, 메서드
public class Cafe {
	//필드 : 음료이름, 수량,가격
	private String name;
	private int number;
	private int price;
	
	//기본 생성자
	public Cafe () {}
	
	//매개변수가 있는 생성자
	public Cafe(String name, int number, int price) {
		this.name = name;
		this.number = number;
		this.price = price;
	}
	
	//메서드 setter, getter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price; 
	}
	 
	//출력
	public void showCafeInfo() {
		System.out.println("음료 종류: " + name + ", 수량 : " + number
				+ ", 가격 : " + price );
		
	}
	
}
