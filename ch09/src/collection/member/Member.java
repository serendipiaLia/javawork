package collection.member;

//VO (value Object) - 자료형으로 사용 
public class Member {
	//필드
	private int memberId;	//회원아이디
	private String memberName;	//회원 이름
	
	//생성자
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	//메서드 getter, setter

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberId + ":" + memberName;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(memberId == member.memberId)
				return true;
		}
		return false;
	}
}
