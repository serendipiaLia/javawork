package exceptions.resource;

public class MyResource implements AutoCloseable{
	//필드
	private String text;
	
	//생성자
	public MyResource(String text) {
		this.text = text;
		System.out.println("[MyResource ( " + text + " ) 열기");
	}
	
	//메서드
	public String read1() {
		System.out.println("[MyResource ( " + text + " ) 읽기");
		return "100";  // Integer 클래스에서 숫자를 문자형으로 변환시킬예정
	}
	public String read2() {
		System.out.println("[MyResource ( " + text + " ) 읽기");
		return "123a";  // Integer 클래스에서 숫자를 문자형으로 변환시킬예정
	}

	@Override
	public void close() throws Exception {
		System.out.println("[MyResource ( " + text + " ) 닫기");
		
	}
}
