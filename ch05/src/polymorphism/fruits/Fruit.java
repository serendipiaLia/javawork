package polymorphism.fruits;
//부모클래스
public class Fruit {
	//필드
	protected String name;	//과일이름 
	protected String weight;  //과일의 중량(무게) g
	protected int price; 		//가격
	
	public Fruit() {}
	
	public void showFruitInfo() { 
		System.out.println("과일 이름 :" + name);
		System.out.println("과일 무게 :" + weight);
		System.out.println("과일 가격 :" + price);
	}
}
