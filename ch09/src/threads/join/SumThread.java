package threads.join;

public class SumThread extends Thread{
	
	private long sum; // class에서는 0으로 초기화 안해도 자동으로 됨. private long sum = 0; (X)
	
	public long getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		super.run();
	}
}
