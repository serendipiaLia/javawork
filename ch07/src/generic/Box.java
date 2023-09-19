package generic;

public class Box<T> {
	//필드
	private T type;
	
	//메서드
	public void set(T type) {
		this.type = type;
	}
	
	public T get() {
		return type;
	}
	
}
