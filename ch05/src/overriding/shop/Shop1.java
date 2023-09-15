package overriding.shop;
// 부모클래스HeadShop 상속받음 (자식클래스)
public class Shop1 extends HeadShop {
	
	//생성자 
	public Shop1(){
		System.out.println("***역세권 매장입니다.***");
	}

	@Override
	public void 된장찌개() {
		System.out.println("된장찌개 : 7,500원");
	}

	@Override
	public void 김치찌개() {
		System.out.println("김치찌개 : 8,000원");
	}

	@Override
	public void 비빔밥() {
		System.out.println("비빔밥 : 8,500원");
	}
	
}
