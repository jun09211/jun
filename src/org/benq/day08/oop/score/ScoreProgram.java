package org.benq.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram {
	public static void main(String args []) {
		/*
		 * 메인메뉴
		 * 1.성적입력
		 * 2.성적출력
		 * 3.종료
		 * 선택:
		 */
		Scanner sc= new Scanner(System.in);
		int math=0;
		int eg =0;
		int kor = 0;
		int sum=0;
		while(true) {
		System.out.println("=====메인메뉴=====");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		
		
			switch(choice) {
			case 1: {
				//성적입력
				System.out.print("국어 : ");
				kor=sc.nextInt();
				System.out.print("영어 : ");
				math=sc.nextInt();
				System.out.print("수학 : ");
				eg=sc.nextInt();
				sum=kor+math+eg;
				break;
			}case 2: {
				//성적 출력
				System.out.print("국어 : "+kor+"\n");
				System.out.print("영어 : "+eg+"\n");
				System.out.print("수학 : "+math+"\n");
				System.out.print("총점 : "+sum+"\n");
				System.out.print("평균 : "+sum/3.0+"\n");
				break;
			}case 3: {
				//프로그램 종류
				System.out.println("프로그램이 종료 되었습니다.");
				break;
			}default:{
				//1~3사이의 숫자 입력
				System.out.println("1~3사이의 숫자 입력해주세요.");
				break;
			}
		}
		
		}
		
		
//		if(choice==1) {
//			//성적입력
//			System.out.print("선택 : ");
//			kor=sc.nextInt();
//			System.out.print("선택 : ");
//			
//			System.out.print("선택 : ");
//		}else if(choice==2) {
//			//성적 출력
//			
//		}else if(choice==3) {
//			//프로그램 종류
//			
//		}else {
//			//1~3사이의 숫자 입력
//			System.out.println("1~3사이의 숫자 입력해주세요.");
//		}
		
	}
}
