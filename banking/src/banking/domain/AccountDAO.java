package banking.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

//Account를 생성, 조회, 수정, 삭제하는 클래스
//DAO - Data Access Object 
public class AccountDAO {	//static 지우기, Main 에서 new로만들거임
	
	Scanner scanner = new Scanner(System.in);
	
	//1. 계좌생성
		public void createAccount() {
			System.out.println("---------------------------------------------------------------");
			System.out.println("계좌 생성");
			System.out.println("---------------------------------------------------------------");
			
			while(true) { 
				System.out.print("계좌번호(형식:00-00-000) : ");
				String regExp = "\\d{2}-\\d{2}-\\d{3}";	//정규 표현식(Regular Expression)
				String ano = scanner.nextLine();
				
				boolean result = Pattern.matches(regExp, ano);
				
				if(result) {
					//중복 계좌가 있는지 체킹! 
					if(findAccount(ano) != null) { //중복 계좌 있으면 
						System.out.println("중복계좌 입니다. 다시 입력하세요.");
					}else { // 중복 계좌가 없으면
						while(true) {
							System.out.print("계좌주(한글+영어) : ");
							String owner = scanner.nextLine();
							
							regExp = "[a-zA-Z가-힣]+"; //영어, 한글만
							result = Pattern.matches(regExp, owner);
							
							if(result) {
								System.out.print("초기 입금액 : ");
								int balance = Integer.parseInt(scanner.nextLine());
								
								//db작업
								
								
								
								break;
							}else {
								System.out.println("계좌주는 한글과 영문만 가능합니다. 다시 입력하세요.");
							}
						} //안 while
						break;
						}		
				}else {
					System.out.println("계좌번호 형식이 아닙니다. 올바른 형식으로 입력하세요.");
				}
			} // 밖 while 
			
		} //createAccount 
		
		//2. 계좌목록
		public void getAccountList() {
			System.out.println("---------------------------------------------------------------");
			System.out.println("계좌 목록");
			System.out.println("---------------------------------------------------------------");
			
			List<Account> accountList = new ArrayList<>();
			//계좌목록조회
			for(int i=0; i<accountList.size(); i++) {
				Account account = accountList.get(i);
					System.out.print("계좌번호 : " + account.getAno() + "\t");
					System.out.print("계좌주 : " + account.getOwner() + "\t");
					System.out.println("잔고 : " + account.getBalance());
				} //for
			} //getAccountList 끝
		
		//3. 입금
		public void deposit() {
			System.out.println("---------------------------------------------------------------");
			System.out.println("입금");
			System.out.println("---------------------------------------------------------------");
			
		while(true) {
			System.out.print("계좌번호 : ");
			String ano = scanner.nextLine();

			//잔고에 더해지는 금액
			if(findAccount(ano) != null) { //찾는 계좌가 있으면
				Account account = findAccount(ano);	
		
				System.out.print("입금액 : ");
				int money = Integer.parseInt(scanner.nextLine());
			
				account.setBalance(account.getBalance() + money);
				System.out.println("결과 : 정상 처리 되었습니다.");
				break;
			}else {
				System.out.println("결과 : 계좌가 없습니다. 다시 입력해 주세요.");
				}
			} //while
		} // deposit
		
		//4. 출금
		public void withdraw() {
			System.out.println("----------------------------------------------------------------");
			System.out.println("출금");
			System.out.println("----------------------------------------------------------------");
				
			while(true) { //계좌번호 재입력
				System.out.print("계좌번호 : ");
				String ano = scanner.nextLine();
			
				if(findAccount(ano) != null) {
					while(true) { // 출금액 재입력
						System.out.print("출금액 : ");
						int money = Integer.parseInt(scanner.nextLine());
					
						//잔고에 더해지는 금액
						Account account = findAccount(ano);	
						if(money > account.getBalance()) { //출금액이 잔고보다 많으면
							System.out.println("잔액이 부족합니다.다시 입력하세요!");
						}else {
							account.setBalance(account.getBalance() - money);
							System.out.println("결과 : 정상 처리 되었습니다.");
							break;
						}
					} // 안쪽 while
					break;
				}else{ 
					System.out.println("계좌가 없습니다. 다시 입력하세요!");
				}
			} // while
		} //withdraw 끝
		
		//5.계좌 삭제
		public void removeAno() {
			System.out.println("---------------------------------------------------------------");
			System.out.println("계좌 삭제");
			System.out.println("---------------------------------------------------------------");
			
			while(true) {
				System.out.print("계좌 번호: ");
				String ano = scanner.nextLine();
			
				if(findAccount(ano) != null) { //찾는 계좌가 있으면
					//db작업
					
					break;
				}else {
					System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
				}
			}//while 끝
		} // removeAno
		
		//6. (특정한)계좌 검색
		public void selectAccount() {
			//계좌번호와 일치하는 계좌 검색
			System.out.println("---------------------------------------------------------------");
			System.out.println("계좌 검색");
			System.out.println("---------------------------------------------------------------");
			
			while(true) {
				System.out.print("찾는 계좌번호(숫자형식:00-00-000) : ");
				String regExp = "\\d{2}-\\d{2}-\\d{3}"; //정규 표현식
				String ano = scanner.nextLine();
				
				boolean result = Pattern.matches(regExp, ano);
				
				if(result) {	
					Account account = findAccount(ano);
					if (account != null) {
						break;
					}else {
						System.out.println("계좌가 없습니다. 다시 입력하세요.");
						}
				}else {
					System.out.println("올바른 계좌번호 형식이 아닙니다. 다시 입력하세요.");
						} // 밖 if
					} //while
				
		}
		
		
		// 계좌 찾기
		public Account findAccount(String ano) {
			Account account = null;
			return account;
		} // findAccount
}
