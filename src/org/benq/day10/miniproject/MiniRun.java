package org.benq.day10.miniproject;

import java.time.LocalDate;

import java.util.Scanner;



public class MiniRun {
	public static void main(String[] args) {
		
		ViewMember view=new ViewMember();
		ManageMember mng=new ManageMember();
		Scanner sc= new Scanner(System.in);
		Member member=new Member();
		while(true) {
			 
			int num=view.printMemu();
			if(num==1) {
				member=view.inputMember();
				mng.registerMember(
						member);
				
			}else if(num==2) {
				member=view.loginMember();
				int a=mng.searchOnebyId(member);
				if(a!=-1) {
					while(true) {
						int num2=view.loginokMember(a);
						if(num2==1) {
							mng.weightEnter(a);
						}else if(num2==2) {//기록보기
							mng.weightNow(a);
						}else if(num2==3) {//기록 수정
							mng.weightNow(a);
							view.weighteye();
							mng.weightUpdate();
						}else if(num2==4) {//회원정보수정
							Member [] members= mng.allMember();
							member=view.memberUpdate(members);
							mng.memberUpdate(member);
							
						}else if(num2==5) {//회원정보 삭제
							view.memberDelete();
							int exit=mng.memberDelete();
							if(exit==111) {
								break;
							}
						}else if(num2==6) {//로그아웃
							break;
						}
				}
				}
				
			}

		
		}
	}
}
