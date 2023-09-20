package abstracts.template;

public class CarTest {
	
	public static void main(String[] args) {
		// 추상 클래스는 객체 생성 안됨.
		// Car car = new Car();
		// 추상 클래스 타입을 객체 생성!
		Car manualCar = new ManualCar(); //ManualCar은 일반 클래스
		manualCar.run();
		
		System.out.println("==========================");
		
		Car myCar = new AIcar();
		myCar.run();
		
	/*	//final클래스 checking
		String msg = "Have a good one!";
		System.out.println(msg);
		
		Integer num = 100;
		System.out.println(num);
	*/
	
	}

}
