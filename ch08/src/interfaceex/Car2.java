package interfaceex;
//Car를 보며 배열로 선언해보기 => CarMain 실행
public class Car2 {
	//필드 - 배열로 선언
	Tire[] tires = {
		new HanTire(), // 0번인덱스
		new HanTire(), // 1번인덱스 => CarMain에서 앞바퀴 교체!
		new KumTire(),
		new KumTire()
	};
	
	//메서드
	void run() {
		for(Tire tire : tires) {
		tire.roll();
		}
	}
	
}
