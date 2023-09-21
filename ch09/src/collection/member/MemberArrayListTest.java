package collection.member;

import java.util.ArrayList;

public class MemberArrayListTest {

	public static void main(String[] args) {
		//MemberArrayList 클래스의 객체 생성 
		MemberArrayList memberList = new MemberArrayList();
		
		//Member 객체 생성
		Member mem1 = new Member(1001, "nagyungLee");
		Member mem2 = new Member(1002, "yeeunRim");
		Member mem3 = new Member(1003, "jihunSeo");
		Member mem4 = new Member(1002, "yeeunRim");
		
		//회원 추가 메서드 호출 
		memberList.addMember(mem1);
		memberList.addMember(mem2);
		memberList.addMember(mem3);
		memberList.addMember(mem4);	//중복허용 됨
		
		//회원 삭제
		memberList.removeMember(1002); //2번 인덱스에 있던 기록삭제
		memberList.removeMember(1004); 
		
		//회원의 객체 수
		System.out.println("총 객체 수 :" + memberList.getSize());
		
		//회원 목록 조회
		memberList.showAllMember();
	}
}
