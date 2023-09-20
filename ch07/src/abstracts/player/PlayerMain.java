package abstracts.player;

public class PlayerMain {

	public static void main(String[] args) {
		//Player 인스턴스 생성
		Player player = new Player(); 
		player.play(1);
		
		//중급자 레벨
		Advanced aLevel = new Advanced();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		//고급자 레벨
		Super sLevel = new Super();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
