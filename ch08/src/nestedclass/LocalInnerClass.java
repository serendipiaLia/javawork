package nestedclass;

//지역 내부 클래스
class Outer{
	int outNum =100;
	static int sNum = 200;
	
	//메서드 - 내부에 MyRunnable클래스
	Runnable getRunnable() {
		int num = 10;	//로컬변수
		
		class MyRunnable implements Runnable {	
			int localNum = 20;	//멤버변수
			
			@Override
			public void run() {
				// num = 20; => 상수로 변환되어 변경될 수 없음
				System.out.println(outNum + " : 외부클래스(outer)의 인스턴스 변수");
				System.out.println(sNum + " : 외부클래스(outer)의 정적 변수");
				System.out.println(localNum + " : 내부클래스(MyRunnable)의 멤버 변수");
				System.out.println(num + " : Runnable의 로컬변수 출력"); 
			}
		}
	/*	MyRunnable myRun = new MyRunnable();
		return myRun;
	*/	
		return new MyRunnable();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable().run();;	//중첩함수 => 결과값 100, 200, 20
	}
}
