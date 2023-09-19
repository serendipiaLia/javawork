package abstracts.car;

public class Bus extends Car{

	@Override
	public void run() { //Car클래스의 run과 refuel
		System.out.println("버스가 달립니다.");
	}

	@Override //Car클래스의 run과 refuel
	public void refuel() {
		System.out.println("천연 가스를 충전합니다.");
		
	}

	// 추상이 아님
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	} 

	@Override
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}

}
