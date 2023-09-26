package threads.synchronize;
//작업 스레드B
public class ThreadB extends Thread {
	//공유 객체 필드 생성
	private WorkObject workObject; 
	
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
		setName("Thread B");
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {	//workObject 객체를 통해서 ThreadA실행 
			workObject.methodB();
		}
	}
}
