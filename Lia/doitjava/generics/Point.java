package generics;
//제네릭 메서드 활용하기 
//public <자료형 매개변수> 반환형메서드이름(자료형 매개변수) {}
public class Point <T,V> {
//한 점을 나타내기 위해 x,y 두 멤버변수를 사용하는데 이는 모두 자료형 매개변수로 선언
	
	//자료형 매개변수 선언하기 (필드)
	T x; 
	V y; 
		// x,y는 점 좌표이므로 double이나 int 둘 다 올 수 있으므로 
		//자료형 매개변수 T,V로 선언
	
	//매개변수 있는 생성자
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	//get 메서드 - generic 메서드!
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
}
