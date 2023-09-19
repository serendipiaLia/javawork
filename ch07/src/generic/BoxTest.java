package generic;

public class BoxTest {

	public static void main(String[] args) {
		//문자형 타입으로 객체 생성
		Box<String> box1 = new Box<>();
	
		box1.set("Good luck! :)");
		String msg = box1.get(); //Box에서 public T가 String이므로
		System.out.println(msg);
		
		//숫자형 타입으로 객체 생성
		Box<Integer> box2 = new Box<>();
		
		box2.set(300);
		Integer num = box2.get();
		System.out.println(num);
		
		//Fruit형 타입으로 객체 생성
		Box<Fruit> box3 = new Box<>();
		box3.set(new Fruit("사과"));
		Fruit apple = box3.get();
		System.out.println(apple);
	}
}
