package generics;
// 사각형의 넓이 계산! 
// Point클래스의 generic메서드 활용
public class GenericMethod {
	//2. 사각형 넓이 구하는 메서드 makeRectangle()
	// 두 점이 Integer형이거나 Double형으로 만들어 질 수 있기 때문에 makeRectangle() 역시
	// 제네릭 메서드로 만들어 줘야함.
	

	
	
	
	public static void main(String[] args) {
		//1. 세로 점 좌표 p1 과 가로 점 좌표 p2 생성 : (정수, 실수);
		//세로 점 좌표 p1 (0, 0.0) , 가로 점 좌표 p2(10, 10.0)
		Point<Integer, Double> p1 = new Point <Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point <Integer, Double>(10, 10.0);
		
		
		
		
		
	}
}
