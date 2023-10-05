package generics;
//Material 추상 클래스 사용 전!
public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		// GenericPrinter<Powder> : Powder 타입의 재료를 사용하는 프린터 생성
		// powderPrinter 변수이름
	
		powderPrinter.setMaterial(new Powder());
		//Powder 객체를 재료로 사용해서 set입력!
		Powder powder = powderPrinter.getMaterial();
		//Powder클래스 powder변수이름 = powderPrinter변수이름 .get 출력
		System.out.println(powderPrinter);
		//출력 (powderPrinter) : Powder클래스에 있는 toString() 구현
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	 
	} 
}
