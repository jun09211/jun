package org.benq.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram2 {
	static int kor;
	static int eg;
	static int math; //scoreprogram2 클래스의 멤버필드
	static int sum;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		finish:
		while(true) {
			
			int choice=printMenu();
			switch(choice) {
			case 1:{
				inputScore();
				break;
			}case 2:{
				outputScore();
				break;
			}case 3:{
				displayMsg("프로그램을 종료합니다.");
				
				break finish;
			}default :{
				displayMsg("1 ~ 3사이의 수를 입력해주세요.");
				break;
			}
				
			}
			
		}
		
	}
	private static void displayMsg(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	private static void outputScore() {
		// TODO Auto-generated method stub
		System.out.print("국어 : "+kor+"\n");
		System.out.print("영어 : "+eg+"\n");
		System.out.print("수학 : "+math+"\n");
		System.out.print("총점 : "+sum+"\n");
		System.out.print("평균 : "+sum/3.0+"\n");
	}
	private static void inputScore() {
		// TODO Auto-generated method stub
		
		//성적입력
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 : ");
		kor=sc.nextInt();
		System.out.print("영어 : ");
		math=sc.nextInt();
		System.out.print("수학 : ");
		eg=sc.nextInt();
		sum=kor+math+eg;
		
	}
	public static int printMenu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=====메인 메뉴=====");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.종료");
		System.out.print("선택>>");
		int choice=sc.nextInt();
		return choice;
	}
}
