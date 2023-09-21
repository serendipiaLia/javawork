package interfaceex;

public class Car {
	// 필드 - 인터페이스형 타입 선언
	Tire frontLeftTire;	 	// == Tire frontLeftTire = new HanTire();
	Tire frontRightTire;	// == Tire fronRightTire = new HanTire();
	Tire backLeftTire;		// == Tire backLeftTire = new KumTire();
	Tire backRightTire;		// == Tire backRightTire = new KumTire();
	
	public Car() {
		frontLeftTire = new HanTire();
		frontRightTire = new HanTire();
		backLeftTire = new KumTire();
		backRightTire = new KumTire();
	}
	// 메서드 
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
