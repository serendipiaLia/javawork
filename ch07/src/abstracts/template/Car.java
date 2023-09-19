package abstracts.template;

public abstract class Car {	//추상클래스

	public abstract void drive();	//추상메서드 선언
	public abstract void stop();	//추상메서드 선언2
	
	public void startCar () {
		System.out.println("시동을 켭니다.");	//함수 호출
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿 메서드 정의 : 상속받는 클래스에서 수정불가!
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	
	
	
	
}
