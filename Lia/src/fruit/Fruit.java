package fruit;
// 과일종류 , 개수, 가격
public class Fruit {
	//필드
	String fruit; 
	int number;
	int price;
	
	//기본생성자
	public Fruit() {}
	
	
	//메서드(함수)
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	public String getFruit() {
		return fruit;
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
	
	public void showFruitInfo() {
		System.out.println("과일이름 : " + fruit + ", 개수 : " 
								+ number + ", 가격 : " + price );
	}
	
	//매개변수 생성자
	public Fruit(String fruit, int number, int price) {
		this.fruit = fruit;
		this.number = number;
		this.price = price;
	}
	

	

}
