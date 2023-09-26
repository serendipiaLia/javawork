package banking.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import banking.array.Account;

public class BankArrayList {

	//통장 계좌를 저장할 자료 구조(arraylist)의 객체 생성
	static List<Account> accountList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean sw = true;
		
		while(sw) {
			try {
			System.out.println("=================================================");
			System.out.println("1.계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("=================================================");
			System.out.print("선택> ");
			
			//메뉴 선택
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount();	//계좌 생성
			}else if(selectNo == 2) {
				getAccountList(); //계좌 목록
			}else if(selectNo == 3) {
				deposit();		 // 입금
			}else if(selectNo == 4) {
				withdraw();		 // 출금
			}else if(selectNo == 5) {
				sw = false;			 //종료
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
			}
			}catch(NumberFormatException e) {
			//	e.printStackTrace();
				System.out.println("올바른 숫자를 입력해 주세요.");
			}
		} // while 끝
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	} // m
	
	//계좌생성
	private static void createAccount() {
		System.out.println("--------------------------------");
		System.out.println("계좌 생성");
		System.out.println("--------------------------------");
		
		while(true) {
			
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		
		//중복 계좌가 있는지 체킹! 
		if(findAccount(ano) != null) { //중복 계좌 있으면 
			System.out.println("중복계좌 입니다. 다시 입력하세요.");
		}else { // 중복 계좌가 없으면
			System.out.print("계좌주 : ");
			String owner = scanner.nextLine();
			
			System.out.print("초기 입금액 : ");
			int balance = Integer.parseInt(scanner.nextLine());
			
			//입력받은 내용을 매개변수로 계좌 생성함
			Account newAccount = new Account(ano, owner, balance);
			accountList.add(newAccount); //arrayList에 저장
			System.out.println("결과 : 계좌가 생성되었습니다.");
			break;
			}	
		} // while 끝
	}
	
	//계좌목록
	private static void getAccountList() {
		System.out.println("--------------------------------");
		System.out.println("계좌 목록");
		System.out.println("--------------------------------");
	
		//계좌목록조회
		for(int i=0; i<accountList.size(); i++) {
			Account account = accountList.get(i);
				System.out.print("계좌번호 : " + account.getAno() + "\t");
				System.out.print("계좌주 : " + account.getOwner() + "\t");
				System.out.println("잔고 : " + account.getBalance());
			}
		} //getAccountList 
	
	//입금
	private static void deposit() {
		System.out.println("--------------------------------");
		System.out.println("입금");
		System.out.println("--------------------------------");
		
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
	
	// 출금
	private static void withdraw() {
		System.out.println("--------------------------------");
		System.out.println("출금");
		System.out.println("--------------------------------");
			
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
			
		}
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountList.size(); i++) {
			//1. 이미 등록된 계좌를 가져오기 
			String dbAno = accountList.get(i).getAno();
			//2. 외부에서 입력한(ano) 계좌와 일치하는지 비교
			if(dbAno.equals(ano)) { 
				account = accountList.get(i); 
				break;
		}
	}
	return account;
}
	
	
	
	
}
