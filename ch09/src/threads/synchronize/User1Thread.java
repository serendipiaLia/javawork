package threads.synchronize;

public class User1Thread extends Thread{
	
	//Calculator 객체를 참조
	private Calculator calculator; 
	
	//생성자
	public User1Thread() {
		setName("User1Thread"); //스레드 이름 생성 setName
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	// run() 재정의
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
