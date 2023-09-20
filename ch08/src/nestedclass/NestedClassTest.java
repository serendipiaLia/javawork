package nestedclass;

class A{
	
	A() {
		System.out.println("A객체 생성");
	}
	
	//A클래스 내부인스턴스 멤버 클래스 B
	class B{
		int field1; //B클래스의 필드
	//	static int field2; => static변수는 외부에서 사용가능, 내부클래스에서 X 
		
		B() {
			System.out.println("B객체 생성"); //생성자
		}
		
		void method1() {} //메서드
	}
	//내부 정적 멤버 클래스 : 정적이므로 static
	static class C{
		int field1;	//B클래스의 field와 이름은 같지만 메모리주소는 틀림
		static int field2;
		
		C (){System.out.println("C객체 생성");} //C 클래스생성자
		
		void method1() {}
		static void method2() {}
	}
	// 메서드 내부의 로컬 클래스 사용
	void method() {
		class D{
			int field1;
		//	static int field2; => static사용불가
			D (){System.out.println("D객체 생성");}
			void method1() {};
		}
		// d객체 생성 (main에서 하지 않고, 호출은 메인에서..)
		D d = new D();
		d.field1 =10;
		d.method1();
		
	}
}

public class NestedClassTest {
	
	public static void main(String[] args) {
		// a객체 생성
		A a = new A();
		
		// b객체 생성 및 호출 (A class를 통해 B class 불러옴)
		A.B b = a.new B();
		b.field1 =3;
		b.method1();
		
		// c객체 생성 및 호출 => static변수가 있으면 클래스 이름으로 직접접근!
		A.C c = new A.C(); //위의 C클래스에 static이 있음
		c.field1 = 2;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		// D클래스의 method 호출 (= d객체 호출)
		a.method();
		
	}
}
