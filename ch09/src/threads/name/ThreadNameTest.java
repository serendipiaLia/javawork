package threads.name;

public class ThreadNameTest {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		//setName "ThreadA" 해줌으로써 : Thread A
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		threadA.run();
		
		//setName을 해주지 않으면 0 붙어서 시작됨 : Thread-1
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		threadB.run();
		
	} //m
}
