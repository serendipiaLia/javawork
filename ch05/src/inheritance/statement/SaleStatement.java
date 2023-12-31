package inheritance.statement;

public class SaleStatement {
	
	public static void main(String[] args) {
		//Drink 클래스 사용
		Drink coffee = new Drink("커피", 2500, 10);
		Drink greentea = new Drink("녹차", 3000, 4);
		
		//Alcohol 클래스 사용 
		Alcohol soju = new Alcohol("소주", 4000, 3, 15.1F);
		Alcohol beer = new Alcohol("맥주", 5000, 5, 7.5F);
		
		//Drink 전표 출력
		Drink.printTitle();		//제목행 
		
		coffee.printData();	
		greentea.printData();
	
		System.out.println("=======================================");
		
		//Alcohol 전표 출력
		Alcohol.printTitle();
		
		soju.printData();
		beer.printData();
		
		//총 계 출력
		int sumVal = coffee.getTotalPrice() + greentea.getTotalPrice()
		+ soju.getTotalPrice() + beer.getTotalPrice();
		
		System.out.println("\n****** 합계금액 " + sumVal + "원 ******");
		
	}
}
