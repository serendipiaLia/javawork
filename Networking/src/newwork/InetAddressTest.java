package newwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		// IP (Internet Protocol)
		try {
			InetAddress local = InetAddress.getLocalHost(); //로컬 컴퓨터 IP얻기
			System.out.println("내 컴퓨터 IP 주소 : " + local.getHostAddress());
			//내 컴퓨터 IP 주소 : 192.168.20.62
			
		// 서버 컴퓨터
		// DNS (Domain Name Service) : 숫자 주소 -> 문자 이름 변경하는 서비스
/*			InetAddress server = InetAddress.getByName("www.naver.com");
			System.out.println("네이버 컴퓨터 IP 주소 :" + server);
*/			// 223.130.200.104 주소창에 검색하면 naver.com나옴
			
			InetAddress [] server = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : server) {
				System.out.println(remote);
			}
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
