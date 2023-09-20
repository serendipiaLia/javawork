package constant;

public class UsingDefine {
	
	public static void main(String[] args) {
		//static이 있는 상수는 클래스 이름으로 직접 접근
		System.out.println("최대값은 " + Define.MAX);
		System.out.println("최소값은 " + Define.MIN);
		
		//과목 
		System.out.println("수학 과목 코드값은 " + Define.MATH + "입니다.");
		System.out.println("영어 과목 코드값은 " + Define.ENG + "입니다.");
		
		//원주율
		System.out.println("원주율은 " + Define.PI);
		System.out.println("원주율은 " + Math.PI); //Math는 java.lang기본제공파일
		
		//문자열 표시
		System.out.println(Define.GOOD_MORNING);
		
	
	} // m
}
