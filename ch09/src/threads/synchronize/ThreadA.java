package threads.synchronize;
//작업 스레드A
public class ThreadA extends Thread {
	//공유 객체 필드 생성
	private WorkObject workObject; 
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
		setName("Thread A");
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {	//workObject 객체를 통해서 ThreadA실행 
			workObject.methodA();
		}
	}
}
