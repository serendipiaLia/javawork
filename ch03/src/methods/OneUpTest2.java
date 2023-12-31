package methods;

public class OneUpTest2 {
	//정적 변수 : static 키워드를 붙인 변수
	//정적변수는 생성된 후 프록그램이 종료될 때 소멸됨
			// 특징 - 값을 공유, 누적
	
	static int x = 1; //전역 공간 (==global 위쪽)
	
	public static int oneUp() {
		x += 1;
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(oneUp()); // 결과값 2
		System.out.println(oneUp()); // 결과값 3
		System.out.println(oneUp()); // 결과값 4
		
		//변수 x의 값 출력
		System.out.println("x = " + x); //마지막에 호출한 값 4
	}
	
	
}
