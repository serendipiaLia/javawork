package interfaceex.remocon2;

import interfaceex.remocon.RemoteControl;
//SmartTV클래스가 RemoteControl,Searchable 두개의 인터페이스를 구현
//SmartTV클래스는 두개의 인터페이스의 모든 메서드와 기능을 구현하고 있어야함.
//인터페이스를 구현한 클래스는 해당 인터페이스에서 정의된 모든 추상메서드를 구체적으로 구현!
public class SmartTV implements RemoteControl, Searchable{
	
	//volume 필드 생성
	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {	//외부에서 입력(main에서..)
		//volume 0 ~ 10으로 설정
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
