package FunctionalInterface.lambdastring;

//람다식으로 StringConct 인터페이스를 사용해서 변수 선언
public class StringConcatTest2 {
	
	public static void main(String[] args) {
		//인터페이스형 변수 선언
		StringConcat concat;
		String str1 = "kh";
		String str2 = "정보통신";
		
		//makeString()구현 -> 람다식
		concat = (m, n) -> System.out.println(m + " " + n);
		
		//makeString()호출
		concat.makeString(str1, str2);
	}
}
