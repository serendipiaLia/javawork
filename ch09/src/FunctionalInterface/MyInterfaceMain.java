package FunctionalInterface;

public class MyInterfaceMain {
	
	public static void main(String[] args) {
		
		MyFunction1 function; //선언
		
		//람다식 표현으로 추상 메서드 실체로 구현
		//매개변수가 없음
	/*	function = () -> {
			System.out.println("안녕 :)");
		};
	*/	
		//코드가 1줄인 경우 {} 생략가능
		function = () -> System.out.println("안녕 :)");
	
		//함수 호출
		function.method();
	}
}
