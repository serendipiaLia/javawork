package inheritance.transport;

public class Main {
	public static void main(String[] args) {
		//Person 객체 생성
		Person yeeun = new Person("임예은", 10000);
		Person jihun = new Person("서지훈", 20000);
		
		System.out.println("====Bus=================");
		//Bus 객체 생성
		Bus bus100 = new Bus("bus100");
		
		yeeun.take(bus100, 1500);
		jihun.take(bus100, 1500);
		
		yeeun.showPersonInfo();
		jihun.showPersonInfo();
		bus100.showInfo();
		
		System.out.println("====Taxi=================");
		//Taxi 객체 생성
		Taxi taxi = new Taxi("카카오택시");
		
		yeeun.take(taxi, 4800);
		jihun.take(taxi, 5000);
		
		yeeun.showPersonInfo();
		jihun.showPersonInfo();
		taxi.showInfo();
	}
	
}
