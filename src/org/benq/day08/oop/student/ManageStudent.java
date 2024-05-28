package org.benq.day08.oop.student;

import java.util.Scanner;

public class ManageStudent {
	int kor;
	int eg;
	int math;
	int sum;
	
	public void outputScore() {
		// TODO Auto-generated method stub
		System.out.print("국어 : "+kor+"\n");
		System.out.print("영어 : "+eg+"\n");
		System.out.print("수학 : "+math+"\n");
		System.out.print("총점 : "+sum+"\n");
		System.out.print("평균 : "+sum/3.0+"\n");
	}
	public void inputScore() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 : ");
		kor=sc.nextInt();
		System.out.print("영어 : ");
		math=sc.nextInt();
		System.out.print("수학 : ");
		eg=sc.nextInt();
		sum=kor+math+eg;
		
	}
}
