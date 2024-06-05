package org.benq.day10.miniproject;

import java.time.LocalDate;
import java.util.Scanner;


public class ManageMember {
	
	private Member [] members= new Member[100];
	
	private int index;
	private int z;

	private int a;

	public ManageMember() {
		members= new Member[100];
		index=0;
		z=0;
		a=0;
	}
	
	public void registerMember(Member member) {
		members[index]=member;
		
		if(index<members.length-1) {
			members[index]=member;
			members[index].getMemberWeight()[0]=member.getMemberWeight2();
			members[index].getMemberDate()[0] = member.getMemberDate2();
			index++;
			
			}
		

	}

	public int searchOnebyId(Member member) {
		a=-1;
		a:
		while(true) {
		for(int i=0;i<members.length;i++) {
			if(members[i] !=null &&members[i].getMemberId().equals(member.getMemberId())) {
				
				if(members[i].getMemberPw().equals(member.getMemberPw())) {
					a=i;
					z++;
				}else {
					System.out.println("비밀번호가 다릅니다.");
					break a;
				}
			}
		}
		if(z==1) {
			System.out.println("로그인이 되었습니다.");
			z--;
			
			break;
		}else {
			System.out.println("아이디가 없습니다.");
			break;
		}
	}
		return a;
	}

	public void weightEnter(int a) {
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<100;j++) {
		if(members[a].getMemberWeight()[j]==0) {
			System.out.print("현재 몸무게를 입력하세요 : ");
			members[a].getMemberWeight()[j]=sc.nextDouble();
			members[a].getMemberDate()[j] =LocalDate.now();
			break;
		}
		}
		
	}

	public int cheickId() {
		int i=0;
			for(Member member:members) {
				if(member !=null) {
					i++;
				}
			}
			return i;
	}

	public Member [] allMember() {
		// TODO Auto-generated method stub
		return members;
	}

	

	public void weightNow(int a) {
		// TODO Auto-generated method stub
		for (int j=0;j<members.length;j++) {
			if(members[a].getMemberWeight()[j]>0) {
				System.out.println(j+1+".날짜 : "+members[a].getMemberDate()[j]
						+"몸무게 : "+members[a].getMemberWeight()[j]);
			}else {
				break;
			}
				
			
		}
	}

	public void memberUpdate(Member member) {
		members[a] = member;
		members[a].getMemberWeight()[0]=member.getMemberWeight2();
		members[a].getMemberDate()[0] = member.getMemberDate2();
	}

	public void weightUpdate() {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		if(members[a].getMemberWeight()[num-1]!=0) {
		System.out.print("수정할 몸무게의 숫자를 입력해주세요 : ");
		members[a].getMemberWeight()[num-1]=sc.nextDouble();
		}else {
			System.out.print("수정할 정보가 없습니다");
		}
		
	}

	public int memberDelete() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1){
		members[a]=null;
		return 111;
		}else if(num==2) {
			System.out.println("탈퇴를 취소하셨습니다.");
		}else {
			System.out.println("1과 2값중 입력해주세요");
		}
		return 0;
	}
}

