package classes.methods;

public class Hello {
	
	// 기본 생성자 
	//public Hello() {} 숨어있음
	
	//sayHello() 메서드 정의
	public void sayHello() {
		System.out.println("안녕!");
	}
	
	//메서드 오버로딩(함수 이름은 같고_sayHello 매개변수가 다름)
	public void sayHello(String name) {
		System.out.println("안녕! " + name);
	}

}
