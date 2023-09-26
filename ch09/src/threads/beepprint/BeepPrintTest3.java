package threads.beepprint;

import java.awt.Toolkit;

public class BeepPrintTest3 {
	
	public static void main(String[] args) {
		//스레드를 익명 객체로 구현 - 소리재생
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=1; i<=5; i++) {
					toolkit.beep();
					
					try {
						Thread.sleep(1000); //1초간 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
		};
		thread.start();
		
		//문자 출력
		for(int i=0; i<=5; i++) {
			System.out.println("Beep!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // m
}
