package org.benq.day05.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1=0,num2=0,num3=0;
		int sum=0;
		while(true) {
			try {
				System.out.print("첫번째 정수 입력 : ");
				num1= sc.nextInt();
				System.out.print("두번째 정수 입력 : ");
				num2= sc.nextInt();
				System.out.print("두번째 정수 입력 : ");
				num3= sc.nextInt();
				sum=num1+num2+num3;
				
			}catch(InputMismatchException e) {
				System.out.println("문자를 입력 하셨습니다.");
				sc.next();
				continue;
			}
			System.out.printf("%d + %d + %d = %d입니다.\n",num1,num2,num3,sum);

		}

		
	}

}
