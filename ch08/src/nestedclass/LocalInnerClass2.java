package nestedclass;

class Out{
	int outNum =100;
	static int sNum = 200;
	
	//익명클래스(이름이 없는) => 클래스 이름을 사용하지 않음!
	Runnable runner = new Runnable() {
		int localNum = 20;
		
		@Override
		public void run() {
		System.out.println(outNum + " : 외부클래스(outer)의 인스턴스 변수");
		System.out.println(sNum + " : 외부클래스(outer)의 정적 변수");
		System.out.println(localNum + " : 내부클래스(MyRunnable)의 멤버 변수");
		}
		
	}; //new Runnable
}

public class LocalInnerClass2 {
	
	public static void main(String[] args) {
			
		Out out =  new Out();
		out.runner.run();
		
	}
}
