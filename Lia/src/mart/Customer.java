package mart;
// 클래스의 3요소 : 필드 , 생성자 , 메서드
//고객 관리 프로그램 구현하기
public class Customer { 
	//고객이름, 고객등급, 고객아이디, 고객 주소, 보너스포인트 , 보너스적립율
	protected String name;
	protected String grade;
	protected String id;
	protected String address;
	int point;		//보너스 포인트
	double ratio;	//보너스 적립율
	
	
	//기본생성자 == 디폴트생성자
/*	public Customer() {
		grade = "basic"; //고객등급
		ratio = 0.01; //보너스 적립율
	} */
	
	//매개변수가 있는 생성자
	public Customer(String name, String id, 
					String address) {
		this.name = name;
		this.id = id;
		this.address = address;
		grade = "basic";
		ratio = 0.01;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

		// 메서드
		// 적립되는 포인트계산 메서드 : 보너스포인트 = 상품가격 * 보너스적립율 
		public int calcPrice(int price) {
			point += price * ratio; // point = point + (price * ratio)
			return price;
		}
	
		//고객 정보를 반환하는 메서드 
		public String showCustomerInfo()  {
			return name + "님의 등급은 " + grade + "이며, 아이디는 " + id + 
					" 입니다. 가입 시 입력한 고객의 주소는 " + address 
					+ "이며 이 고객의 적립된 포인트는 " + point + "점 입니다.";

			
		}

	
	
	
	
}
