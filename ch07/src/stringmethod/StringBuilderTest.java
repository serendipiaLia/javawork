package stringmethod;

public class StringBuilderTest {

	public static void main(String[] args) {
		//StringBuilder, StringBuffer : 문자열 변경이 가능한 클래스 (메모리주소 유지)
		String javaStr = new String("java");
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println(buffer);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(javaStr));
	
		//문자열 추가, 연결 : append() 사용
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		
		System.out.println(buffer);
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(javaStr));
		
	}
}
