package serialization;

import java.io.Serializable;

//Product 클래스 직렬화하기
public class Product implements Serializable{

	private static final long serialVersionUID = 1002L;
	
	private String name; //상품명
	private int price; //가격
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + price; //문자열(", ")이 제일 큼 
	}

}
