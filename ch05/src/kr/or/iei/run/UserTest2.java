package kr.or.iei.run;	//ch05

import kr.or.iei.model.User;

public class UserTest2 {

	public static void main(String[] args) {
		/*
		//매개변수가 있는 생성자로, user1 인스턴스 생성
		User user1 = new User("Lia123", "12345", "이나경");
		
		System.out.println("아이디: " + user1.getId());
		System.out.println("비밀번호: " + user1.getPassword());
		System.out.println("이름: " + user1.getName());
		*/
		
		//크기가 3인 배열 생성
		User[] users = new User[3];
		
		//user 3개 객체 생성
		User user1 = new User("Lia123", "12345", "이나경");
		User user2 = new User("jihun123", "56789", "서지훈");
		User user3 = new User("yeaheun123", "101112", "임예은");
		
		//배열에 객체를 저장
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		
		//users[0] 1개 출력 
		System.out.println(users[0].getId() + ", " 
				+ users[0].getPassword() + " , " + users[0].getName());
		
		System.out.println("=============================");
		
		//전체 출력
		for(int i=0; i <users.length; i++) {
			System.out.println(users[i].getId() + ", " 
						+ users[i].getPassword() + " , " + users[i].getName());
		}
		
	} 
}
