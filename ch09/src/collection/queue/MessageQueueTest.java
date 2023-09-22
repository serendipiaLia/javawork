package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueTest {
	public static void main(String[] args) {
		// Queue를 구현한 LinkedList를 자료구조로 사용
		Queue<Message> msgQueue = new LinkedList<>();
		
		// Message 객체 생성
		Message email = new Message("Email", "yeeumRim");
		Message sms = new Message("SMS", "jihunSeo");
		Message katalk = new Message("Katalk", "kanginLee");
		
		// Message 객체 저장 : offer() 사용
		msgQueue.offer(email);
		msgQueue.offer(sms);
		msgQueue.offer(katalk);
		
		// 객체 꺼내기 (꺼내는 순간 삭제됨) : poll()사용
		// 반복 - 확인, isEmpty()사용
		while(!msgQueue.isEmpty()) {
			Message message = msgQueue.poll(); //1개꺼냄
			switch(message.command) {
			case "Email" :
				System.out.println(message.to + "님에게 Email을 보냅니다.");
				break;
			case "SMS" :
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "Katalk" :
				System.out.println(message.to + "님에게 Katalk을 보냅니다.");
				break;
			}
		}
	}
}
