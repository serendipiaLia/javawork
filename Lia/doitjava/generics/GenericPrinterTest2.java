package generics;
// Material 추상 클래스를 구현한 Main
public class GenericPrinterTest2 {
	
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder()); //set으로 입력
		powderPrinter.printing(); // Material에서 상속받은 GenericPrinter<T>의 doPrinting() 구현
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.printing(); // 출력 doPrinting()
		
	}
}
