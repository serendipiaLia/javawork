package abstracts.car;

public class AutoCar extends Car{

	@Override	//추상메서드 run
	public void run() {
		System.out.println("차가 달립니다.");
	}

	@Override	//추상메서드 refuel
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}

	//추상이 아님
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}


}
