package chapter9.step1;

public abstract class Car {
	
	public abstract void run();
	public abstract void refuel();
	public void stop() { //stop은 멈춤이 같으므로 
		System.out.println("차가 멈춥니다.");
	};
		
	

}
