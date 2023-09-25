package threads.synchronize;

public class Calculator {
	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//synchronized 키워드를 붙히면 lock 걸어서 다른 스레드에 의해서 변경되지 않음
	public synchronized void setMemory(int memory) { //synchronized 없으면 User1Thread 값 100
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		
	}
}
