package collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2>{
	private int memberId;
	private String memberName;
	
	public Member2() {}
	
	public Member2(int memberId, String memberName) {
		this.setMemberId(memberId);
		this.setMemberName(memberName);
	}

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
		return memberName + " 회원님의 아이디는 " + memberId+" 입니다.";
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member)obj;
//			if(this.memberId == member.memberId) {
//				return true;
//			}else {
//				return false;
//			}
//		}
		if(this.hashCode() == obj.hashCode()) {
			return true;
		}
		return false;
	}

//	@Override
//	public int compareTo(Member2 member) {
//		// TODO Auto-generated method stub
//		//오름차순 정렬
//		//return this.memberId - member.memberId;
//		//내림차순 정렬
//		//return (this.memberId - member.memberId)*-1;
//		//오름차순 정렬
//		//return this.memberName.compareTo(member.memberName)*-1;
//		//내림차순 정렬
//		return this.memberName.compareTo(member.memberName)*-1;
//	}
	
	@Override
	public int compare(Member2 o1, Member2 o2) {
		return o1.memberId - o2.memberId;
	}
}








