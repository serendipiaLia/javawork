package abstracts.shop;

public class ShopTest {

	public static void main(String[] args) {
		//추상클래스는 객체생성 할 수 없음 
		//  :: HeadShop shop1 = new HeadShop();
	
		//부모 타입으로 객체 생성
		HeadShop shop1 = new Shop1();
		shop1.된장찌개();
		shop1.김치찌개();
		shop1.순두부찌개();
		
		HeadShop shop2 = new Shop2();
		shop2.된장찌개();
		shop2.김치찌개();
		shop2.순두부찌개();

	}

}
