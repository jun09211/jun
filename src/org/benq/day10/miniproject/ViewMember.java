package org.benq.day10.miniproject;

import java.time.LocalDate;
import java.util.Scanner;


public class ViewMember {
	String id;
	int a;

	public int printMemu() {
		Scanner sc =new Scanner(System.in);
		System.out.println("몸무게 관리 프로그램");
		System.out.print("1.회원가입\n2.로그인\n");
		int num=sc.nextInt();
		return num;
	}

	public Member inputMember() {
		
				Scanner sc=new Scanner(System.in);
				System.out.print("아이디 : ");
				String memberId=sc.next();
				System.out.print("비밀번호 : ");
				String memberPw=sc.next();
				System.out.print("이름 : ");
				String memberName=sc.next();
				System.out.print("나이 : ");
				int memberAge=sc.nextInt();
				System.out.print("이메일 : ");
				String memberEmail=sc.next();
				System.out.print("전화번호 : ");
				String memberPhone=sc.next();
				System.out.print("주소 : ");
				String memberAddress=sc.next();
				System.out.print("현재몸무게 : ");
				
				double memberWeight[]=new double[50];
				memberWeight[0]= sc.nextDouble();
				LocalDate memberDate[]=new LocalDate[50];
				memberDate[0]= LocalDate.now(); 
				
				Member member= new Member();
				member.setMemberId(memberId);
				member.setMemberPw(memberPw);
				member.setMemberName(memberName);
				member.setMemberAge(memberAge);
				member.setMemberEmail(memberEmail);
				member.setMemberPhone(memberPhone);
				member.setMemberAddress(memberAddress);
				member.setMemberWeight2(memberWeight[0]);
				member.setMemberDate2(memberDate[0]);
				return member;
			

	}

	public Member loginMember() {
		Scanner sc=new Scanner(System.in);

		System.out.print("아이디 : ");
		id=sc.next();
		System.out.print("비밀번호 : ");
		String pa=sc.next();
		Member member = new Member();
		member.setMemberId(id);
		member.setMemberPw(pa);
		return member;
		
	}

	public int loginokMember(int b) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("몸무게 관리 프로그램");
		System.out.print("1.몸무게 등록\n2.등록된 기록 보기\n3.등록된 기록 수정\n4.회원정보수정\n"
				+ "5.회원정보삭제\n6.로그 아웃\n");
		int num=sc.nextInt();
		a=b;
		return num;
	}

	public Member memberUpdate(Member [] members) {
			for(Member member : members) {
				if(member!=null) {
					if(id.equals(member.getMemberId())) {
					System.out.println("=====회원 정보 보기=====");
					System.out.print("1.이름 : "+member.getMemberName()+ "\n2.나이: "+member.getMemberAge()+ 
							"\n3.이메일"+member.getMemberEmail()+"\n4.번호 :"+member.getMemberPhone()+ "\n5.주소 :"+member.getMemberAddress()+ "\n6.취소\n");
					}
				}
			}
			System.out.println("수정할 정보의 숫자를 입력해주세요 : ");
			Scanner sc = new Scanner(System.in);
			Member member = new Member();
			int num=sc.nextInt();
			if(num==1) {
				System.out.println("수정할 이름을 입력해주세요 : "+members[a].getMemberName());
				member.setMemberName(sc.next());
				member.setMemberId(members[a].getMemberId());
				member.setMemberPw(members[a].getMemberPw());
				member.setMemberAge(members[a].getMemberAge());
				member.setMemberEmail(members[a].getMemberEmail());
				member.setMemberPhone(members[a].getMemberPhone());
				member.setMemberAddress(members[a].getMemberAddress());
				member.setMemberWeight2(members[a].getMemberWeight()[0]);
				member.setMemberDate2(members[a].getMemberDate()[0]);
			}else if(num==2) {
				System.out.println("수정할 나이을 입력해주세요 : "+members[a].getMemberAge());
				member.setMemberAge(sc.nextInt());
				member.setMemberName(members[a].getMemberName());
				member.setMemberId(members[a].getMemberId());
				member.setMemberPw(members[a].getMemberPw());
				member.setMemberEmail(members[a].getMemberEmail());
				member.setMemberPhone(members[a].getMemberPhone());
				member.setMemberAddress(members[a].getMemberAddress());
				member.setMemberWeight2(members[a].getMemberWeight()[0]);
				member.setMemberDate2(members[a].getMemberDate()[0]);
			}else if(num==3) {
				System.out.println("수정할 이메일을 입력해주세요 : "+members[a].getMemberEmail());
				member.setMemberEmail(sc.next());
				member.setMemberName(members[a].getMemberName());
				member.setMemberId(members[a].getMemberId());
				member.setMemberPw(members[a].getMemberPw());
				member.setMemberAge(members[a].getMemberAge());
				member.setMemberPhone(members[a].getMemberPhone());
				member.setMemberAddress(members[a].getMemberAddress());
				member.setMemberWeight2(members[a].getMemberWeight()[0]);
				member.setMemberDate2(members[a].getMemberDate()[0]);
			}else if(num==4) {
				System.out.println("수정할 번호을 입력해주세요 : "+members[a].getMemberPhone());
				member.setMemberPhone(sc.next());
				member.setMemberName(members[a].getMemberName());
				member.setMemberId(members[a].getMemberId());
				member.setMemberPw(members[a].getMemberPw());
				member.setMemberAge(members[a].getMemberAge());
				member.setMemberEmail(members[a].getMemberEmail());
				member.setMemberAddress(members[a].getMemberAddress());
				member.setMemberWeight2(members[a].getMemberWeight()[0]);
				member.setMemberDate2(members[a].getMemberDate()[0]);
				
			}else if(num==5) {
				System.out.println("수정할 주소을 입력해주세요 : "+members[a].getMemberAddress());
				member.setMemberAddress(sc.next());
				member.setMemberName(members[a].getMemberName());
				member.setMemberId(members[a].getMemberId());
				member.setMemberPw(members[a].getMemberPw());
				member.setMemberAge(members[a].getMemberAge());
				member.setMemberEmail(members[a].getMemberEmail());
				member.setMemberPhone(members[a].getMemberPhone());
				member.setMemberWeight2(members[a].getMemberWeight()[0]);
				member.setMemberDate2(members[a].getMemberDate()[0]);
			}else{//취소
				System.out.println("취소 하셨습니다.");
			}
			return member;
}


	public void weightNow() {
		Member member=new Member();
		
		
	}

	public void weighteye() {
		System.out.print("몇번째 정보를 수정하시겠습니까 : ");
		
	}

	public void memberDelete() {
		// TODO Auto-generated method stub
		System.out.print("정말로 회원탈퇴 하시겠습니까. 하시겠으면 1, 취소하실려면 2를 입력해주세요.\n");
	}



}
