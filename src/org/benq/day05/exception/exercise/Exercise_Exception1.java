package org.benq.day05.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception1 {
	public static void main(String[] args) {
		//정수를 0으로 나누는 경우에 :0으로 나눌수 없습니다.
		//다시 입력 받는 프로그램을 작성하여라.
		while(true) {
			int num1=0,num2=0;
			int result=0;
			Scanner sc= new Scanner(System.in);
			try {
				
				System.out.print("첫번째 정수 입력 : ");
				num1= sc.nextInt();
				System.out.print("두번째 정수 입력 : ");
				num2= sc.nextInt();
				result=num1/num2;
				
			}catch(ArithmeticException e) {
				//e.printStackTrace();
				System.out.println("0으로 나눌 수 없습니다.");
				continue;
			}catch(InputMismatchException e) {
				System.out.println("문자를 입력 하셨습니다.");
				sc.next();
				continue;
			}
			
			System.out.printf("%d을 %d로 나누면 몫은 %d입니다.\n",num1,num2,result);
		}

	}
}
