package abstracts.car;

public class CarTest {
	
	public static void main(String[] args) {
		
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();
		
		bus.run();	//객체의 메서드(함수) 호출
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();
	}
}
