package whileexample;

public class WhileIfBreak {

	public static void main(String[] args) {
		// 반복 조건문
		// 1부터 10 까지 출력
		
		int i = 0;
		
		while(true) {  //무한반복
			i++;
			System.out.println(i);
			    //출력할 때 옆으로 하려면 : System.out.print (i + " ");
			if(i == 10) // if{}중괄호 블럭은 실행문이 1줄일 때 생략가능
				break; //탈출 
			
			
		}
		
		
		
		
	}
}
