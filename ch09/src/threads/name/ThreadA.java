package threads.name;

public class ThreadA extends Thread{
		
	public ThreadA() {
		this.setName("Thread A");
	}
	
	@Override
	public void run() {
		//ThreadA의 이름 : getName()
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
