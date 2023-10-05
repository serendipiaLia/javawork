package test231005.datainoutput;

import java.net.ServerSocket;
import java.util.Scanner;

public class EchoServerEx {
	
	/* 1.필드 - 서버 소켓 객체 선언 */
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		System.out.println("=============================================");
		System.out.println("서버를 종료하려면 'q'또는 'Q'를 입력하고 Enter를 누르세요.");
		System.out.println("=============================================");
		
		/* 2.TCP 서버 시작 - startServer(); 항상 시작하는 함수 써주기! */
//		startServer();
		
		/* 3. 서버종료 q키 입력 스캐너 만들기 */
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String keyboard = scanner.nextLine();
			if(keyboard.toLowerCase().equals("q")) { //toLowerCase() : 대문자를 소문자로, 소문자를 대문자로
				break;
			}
		}
		scanner.close();
		
	} //m
	
	/* 4. 항상 대기 - thread 만들기 */

}
