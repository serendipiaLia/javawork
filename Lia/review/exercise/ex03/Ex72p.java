package exercise.ex03;
//부호연산자
public class Ex72p {
	
	public static void main(String[] args) {
		
	int num = 10;
	
	System.out.println(+num);	//10 그대로 출력
	System.out.println(-num);	//-10 num값이 실제로 음수가 아님
	System.out.println(num);	//10 그대로 출력
	
	//num값을 음수로 바꿔서 num에 대입!
	num = -num;	
	System.out.println(num);	// -10 값이 출력됨
	
	
	}
	
}
