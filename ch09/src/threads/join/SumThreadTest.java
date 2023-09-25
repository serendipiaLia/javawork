package threads.join;

public class SumThreadTest {

	public static void main(String[] args) {
		// SumThread 객체 생성
		SumThread sumThread = new SumThread();
		
		// 메인 스레드가 sumThread를 호출하고 일시 정시 상태로 들어감
		sumThread.start(); 
		
		try {
			sumThread.join();	// join()으로 참여하면서 run()실행 함
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//정지상태start()에서 join()안하고 run()실행하면 0
		// 메인 스레드가 최종 계산된 결과값을 산출하고 종료하면 다시 메인 스레드는 결과값을 받아 출력함
		System.out.println(sumThread.getSum()); 
	}
}
