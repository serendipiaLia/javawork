package interfaceex;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar = new Car(); //Car생성
	//	myCar.run();
		
		//앞바퀴 교체(변경) :2가지
		
		myCar.frontLeftTire = new KumTire(); 
		myCar.frontRightTire = new KumTire();
		
		myCar.run();
		 
	/*	KumTire kum1 = new KumTire();
		KumTire kum2 = new KumTire();
		
		myCar.frontLeftTire = kum1;
		myCar.frontRightTire = kum2;
    */	
		 System.out.println("=== Car2 ========================");
		 
		 Car2 myCar2 = new Car2();
		 
		 //앞바퀴 교체(변경)
		 myCar2.tires[0] = new KumTire(); //Car2의 HanTire 교체
		 myCar2.tires[1] = new KumTire(); // Car2의 HanTire 교체
		 myCar2.run();
	}
}
