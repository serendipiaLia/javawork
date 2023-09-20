package interfaceex.remocon;

import interfaceex.remocon2.Searchable;
import interfaceex.remocon2.SmartTV;

public class SmartTVTest {

	public static void main(String[] args) {
		//구현 객체(인스턴스) = tv
		SmartTV tv = new SmartTV();
		
		//구현인스턴스를 인터페이스 타입에 저장(자동 형 변환)
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
		rc.turnOn();
		rc.setVolume(8);
		searchable.search("www.naver.com");
		rc.setMute(true);
		rc.turnOff();
		
		RemoteControl.changeBattery();
	}
	
}
