package collection.member;

public class MemberHashMapTest {
	
	public static void main(String[] args) {
		//MemberHashMap 객체 생성
		MemberHashMap memberMap = new MemberHashMap();
		
		//회원 추가 
		memberMap.addMember(new Member(1001, "nagyungLee")); //MemberHashMap에서 회원추가 add()사용
		memberMap.addMember(new Member(1002, "yeeunRim"));
		memberMap.addMember(new Member(1003, "jihunSeo"));
	//	memberMap.addMember(new Member(1002, "yeeunRim"));	// key,value중복 되서 출력 x
		memberMap.addMember(new Member(1002, "kanginLee"));	// key값 중복x, value값은 변경ok
		
		//객체의 수 
		System.out.println("총 객체 수: " + memberMap.getSize());
		
		// 회원 삭제 
		memberMap.removeMember(1003);
		System.out.println("1003회원 삭제 후, 총 객체 수: " + memberMap.getSize());
		memberMap.removeMember(1004); // 1004회원은 존재하지않음 -> MemberHashMap회원삭제부분
		
		//회원 목록
		memberMap.showAllMember();
		
	}
}
