package collection.queue;

public class MyQueueTest {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue(); //enQueue나 deQueue 사용해야 하기때문에 생성
		
		//자료저장
		queue.enQueue("watermelon");
		queue.enQueue("orange");
		queue.enQueue("apple");
		
		//자료삭제(출력)
		System.out.println(queue.deQueue()); //watermelon
		System.out.println(queue.deQueue()); //orange
		System.out.println(queue.deQueue()); //apple
		System.out.println(queue.deQueue()); //error! -> 자료가 없으므로
	}
}
