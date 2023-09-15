package protectedex.pack1;
//class A에 접근 
public class B {

	public void method() {
		A a = new A();
		a.field = "yes";
		a.method();
	}
	
}
