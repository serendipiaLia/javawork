package singleton;

public class CompanyTest {
	
	public static void main(String[] args) {
		
		Company company1 = Company.getInstance(); //Company 클래스 호출
		Company company2 = Company.getInstance();
		
				System.out.println(company1);
				System.out.println(company2); //company1과 2는 같은 메모리 주소
				
		System.out.println((company1 == company2)); //결과값 true
				
	}
}
