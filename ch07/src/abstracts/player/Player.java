package abstracts.player;

public class Player {
	//PlayerLevel 참조, 필드
	private PlayerLevel level;

	//생성자
	public Player() {
		level = new Beginner();	//기본으로 초보자 생성
		level.showLevelMessage(); //초보자입니다. 출력하기
	}
	
	//레벨 업그레이드 하는 메서드
	public void upgradeLevel(PlayerLevel level) {
		this.level = level; //초기화, 중급자 고급자를 위한 설정
		level.showLevelMessage();
	}
	//Player가 게임하는 메서드
	public void play(int count) {
		level.go(count);
	}
}
