package kr.or.iei.run;	//ch06

import kr.or.iei.model.User;

public class UserTest {
	public static void main(String[] args) {
		// 객체를 저장할 크기가 5인 user배열 생성
		User[] users = new User[4];
		
		//객체 4인 생성 아이디,비밀번호,이름
		User user1 = new User("lee", "1234", "이나경");
		User user2 = new User("kim", "1555", "김기용강사님");
		User user3 = new User("rim", "1215", "임예은");
		User user4 = new User("seo", "1214", "서지훈");
		
		//인덱스 순서에 따라서 저장 
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		users[3] = user4;
		
		//1개 출력
		System.out.println(users[2].getId() + users[2].getPassword() 
				+ users[2].getName());
		//for문
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i]);
			//users[i].showUserInfo();
		}
		
		//showInfo
		//user1.showUserInfo();
		
		//toString
		System.out.println(users[0]);
		
	}
}
