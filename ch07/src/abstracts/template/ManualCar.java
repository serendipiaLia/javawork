package abstracts.template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}
	/* 
	 Car클래스에서 run()을 final사용했기 때문에 상속받는 이 클래스에서 사용불가!
	  public void run () {
		drive();
		stop();
	} 
	*/  

	
	
	
	
}
