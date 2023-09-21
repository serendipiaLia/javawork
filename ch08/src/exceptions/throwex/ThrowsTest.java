package exceptions.throwex;

public class ThrowsTest {
	
	public static void main(String[] args) {
		//함수를 호출한 곳에서 예외 처리함 
		try {
			findClass();
		} catch (ClassNotFoundException e) {
		//	e.printStackTrace();
			System.out.println(e.toString());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		//컴파일러가 체크해줌 - 일반예외 (실행 전 오류)
		//throws는 예외 미룸
		Class.forName("java.lang.System2");
	}
}
