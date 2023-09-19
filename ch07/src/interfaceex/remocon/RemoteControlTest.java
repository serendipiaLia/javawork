package interfaceex.remocon;

public class RemoteControlTest {
	
	public static void main(String[] args) {
		//인터페이스형(부모 타입)으로 객체 생성 - 자동 형 변환
		RemoteControl rcTV = new Television();
		
		rcTV.turnOn();
		rcTV.setVolume(12);
		rcTV.setMute(true);
		rcTV.setMute(false);
		rcTV.turnOff();
		
		//건전지 교환
		RemoteControl.changeBattery();
		
	}
}
