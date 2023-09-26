package collection.stack;

public class MyStackTest {
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		//객체 넣기(저장) push()
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		//객체 빼기(삭제) pop()
		System.out.println(stack.pop()); // c 2번인덱스
		System.out.println(stack.pop()); // b 1번인덱스
		System.out.println(stack.pop()); // a 0번인덱스 
			//Stack은 후입선출이므로, 마지막에 들어간 c가 제일 먼저 나옴!
		System.out.println(stack.pop()); // 인덱스의 자리를 넘어서므로,, MyStack에서 써준 자료삭제가 출력
	}
}
