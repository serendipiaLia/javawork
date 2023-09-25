package threads.beepprint;

public class BeepPrintTest2 {
	
	public static void main(String[] args) {
		//beepTask 객체 생성(작업 스레드)
		Runnable beepTask = new BeepTask();
		//작업 스레드 객체 생성
		Thread thread = new Thread(beepTask);
		thread.start(); // 스레드 시작(실행)
		
		for(int i=1; i<=5; i++) {
			System.out.println("Beep!");
			try {
				Thread.sleep(1000);  // Thread.sleep(1000) : 1초 간격 - 대기 시간 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}