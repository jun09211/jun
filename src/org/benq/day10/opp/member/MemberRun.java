package org.benq.day10.opp.member;

import java.util.Scanner;

public class MemberRun {
	public static void main(String[] args) {
		/*
		 * 회원관리 프로그램
		 * 1.회원가입
		 * 2.회원검색
		 * 3.회원정보수정
		 * 4.회원정보삭제
		 * 
		 */
		
		ViewMember view=new ViewMember();
		ManageMember mng=new ManageMember();
		Scanner sc= new Scanner(System.in);
		end:
		while(true) {
			int menu=view.printMemu();
			switch(menu) {
			
			case 1:
				//회원정보입력
				Member member=view.inputMember();
				//배열에 저장
				mng.registerMember(member);
				break;
			case 2:
				//아이디 입력
				String memberId=view.inputMemberId();
				//배열에서 찾기
				member=mng.searchOnebyId(memberId);
				//찾은거 출력하게
				mng.registerMember(member);
				break;
			
			case 3:
//				member=mng.allMember();
//				view.displayMember(member);
				Member [] members= mng.allMember();
				view.displayMemberList(members);
				
				break;
			
			case 4:
				view.printMessage("프로그램을 종료하겠습니다.");
//				System.out.println("종료");
				break end;
				
			default :
				view.printMessage("잘못 입력하셨습니다.");
//				System.out.println("잘못 입력하셨습니다.");
			
			}
		}
		
	}
}
