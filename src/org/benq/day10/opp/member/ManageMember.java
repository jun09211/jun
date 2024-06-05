package org.benq.day10.opp.member;

public class ManageMember {
//	Member member= new Member();
	private Member [] members= new Member[5];
	
	private int index;
	
	public ManageMember() {
		members= new Member[5];
		index=0;
	}
	
	public void registerMember(Member member) {
//		this.member=member;
		members[index]=member;
		if(index<members.length-1) {
			members[index]=member;
			index++;
			}
	}

	public Member [] allMember() {
		// TODO Auto-generated method stub
		return members;
	}

	public Member searchOnebyId(String memberId) {
		for(Member member : members) {
			if((member !=null &&memberId.equals(member.getMemberId()))) {
				return member;
			}
		}
		return null;
	}
}
