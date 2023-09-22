package FunctionalInterface;

public class MyClass implements MyFunction1{
	// MyFunction1 인터페이스를 구현해서 
	//"hello"를 프린트하기

	@Override
	public void method() {
		System.out.println("hello");
	}
}
