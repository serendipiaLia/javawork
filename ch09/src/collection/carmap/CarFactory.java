package collection.carmap;

import java.util.HashMap;
import java.util.Map;

// 싱글톤 패턴이므로 인스턴스를 단 하나만 생성할 수 있도록 구현되어있음.

public class CarFactory {
	//자동차를 생성할 때 HashMap에 저장
	private static CarFactory instance; //클래스의 객체를 단 하나만 가질 수 있도록 static 정적필드선언
	private Map<String, Car> carMap = new HashMap<>(); 
	//Car객체를 이름(String)을 키(key)로 사용하여 관리하기 위한 HashMap 선언 및 초기화
	
	private CarFactory() {}; 
	//생성자를 private으로 선언하여 외부에서 인스턴스 생성하는것을 막고, 'getInstance'메서드로 인스턴스를
	//얻을 수 있도록 함
	
	public static CarFactory getInstance() { //CarFactory 클래스의 인스턴스를 반환하는 정적메서드
		if(instance == null) {	
			instance = new CarFactory();
		}
		return instance; //인스턴스가 이미 생성됐으면 그 인스턴스 반환,
						 //인스턴스가 없다면 새로운 인스턴스 생성하여 반환
	}

	//자동차 생성 메서드
	public Car createCar(String name) { // 차 이름(= key)
		if(carMap.containsKey(name)) {	//carMap에 이름(key)이 있으면
			carMap.get(name);
		}
		//Car 객체 생성
		Car car = new Car();
		//carMap에 name, car 저장
		carMap.put(name, car);
		return car;
	}
}
