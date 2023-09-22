package FunctionalInterface.lambdaint;

public class MyNumber2Test {

	public static void main(String[] args) {
		
		MyNumber2 myNum;
		
		//람다식으로 getMax() 구현
	/*	myNum = (x,y) -> {
			return x >= y ? x : y;	//삼항 연산자 true면 x, false면 y
		};
		
	*/	
		//람다식에서 return과 { } 생략하기
		myNum = (x,y) -> x >= y ? x : y; //삼항 연산자 true면 x, false면 y
		
		//getMax 호출
		// myNum.getMax(10, 20);
		System.out.println("더 큰 수는, " + myNum.getMax(5, 11));
	}
}
