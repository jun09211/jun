package org.benq.day06.array.sort.exercise;

import java.util.Scanner;

public class Customer2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1 ~ 100 사이의 정수를 입력하세요 : ");
		int num=sc.nextInt();
		int sum=0;
		if(num>100||num<0) {
			System.out.print("1 ~ 100 사이의 정수를 입력하세요!");
		}else if(num==1) {
			System.out.print("1은 소수가 아닙니다.");
		}
		for (int i=2;i<=num;i++) {
			if(num%i==0)
			{
				sum++;
			}
		}
		if(sum==1) {
			System.out.print(num+"은(는) 소수입니다."+sum);
		}else {
			System.out.print(num+"은(는) 소수가 아닙니다."+sum);
		}
		
	}

}
