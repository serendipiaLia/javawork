package threads.synchronize;

public class WorkObject {
	//synchronized 동기화 메서드로 구현(내부적으로 잠금, lock)
	public synchronized void methodA() { 
		// 현재 실행중인 스레드 객체 생성
		Thread thread = Thread.currentThread(); 
		System.out.println(thread.getName() + " 작업 실행");
		
		notify(); // 다른 스레드를 실행 대기 상태로 만들어 주는 메서드! (알림)
		
		try {
			wait();	//자신은 일시 정지 상태로 만드는 메서드
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	
		public synchronized void methodB() { //synchronized 동기화
			// 현재 실행중인 스레드 객체 생성
			Thread thread = Thread.currentThread(); 
			System.out.println(thread.getName() + " 작업 실행");
			
			notify(); // 다른 스레드를 실행 대기 상태로 만들어 주는 메서드! (알림)
			
			try {
				wait();	//자신은 일시 정지 상태로 만드는 메서드
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
	} //m
}
