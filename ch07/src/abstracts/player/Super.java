package abstracts.player;

public class Super extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("매우 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("매우 높이 jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("빠르게 turn합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**** Super Level ****");
	}
}
