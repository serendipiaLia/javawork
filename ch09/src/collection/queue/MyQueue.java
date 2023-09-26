package collection.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {

	//필드
	private List<String> arrayQueue;
	
	//생성자
	public MyQueue() {
		arrayQueue = new ArrayList<>();
	}

	//자료 저장 - add() : 자료가 맨 뒤에서 추가됨
	public void enQueue(String data) { 
		arrayQueue.add(data); //Arraylist 활용해서 저장
	}
	
	//자료 출력(삭제,꺼내기) - remove() : 맨 앞에서 자료를 꺼내옴!
	public String deQueue() {
		int size = arrayQueue.size();
		if(size == 0) {
			System.out.println("!! Q is empty !!");
			return null;
		}
		return arrayQueue.remove(0); //인덱스 0번에서 꺼내기 (맨 앞)
	}
	
}
