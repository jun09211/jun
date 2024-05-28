package org.benq.day08.oop.score;

import java.util.Scanner;

public class Student {
	//멤버 필드
	static int kor;
	static int eg;
	static int math;
	static int sum;
	//생성자
	public Student() {}
	
	
	//멤버 메소드
	//메뉴 출력
	public int printMenu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=====메인 메뉴=====");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.종료");
		System.out.print("선택>>");
		int choice=sc.nextInt();
		return choice;
	}
	//성적 입력
	public void inputScore() {
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
	//성적 출력
	public void outputScore() {
		// TODO Auto-generated method stub
		System.out.print("국어 : "+kor+"\n");
		System.out.print("영어 : "+eg+"\n");
		System.out.print("수학 : "+math+"\n");
		System.out.print("총점 : "+sum+"\n");
		System.out.print("평균 : "+sum/3.0+"\n");
	}
	//메세지 출력
	public void displayMsg(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}


	
	
}
