package org.benq.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String[] args) {
		//돈전 앞뒤 맞추기!
		//=====동전 앞 뒤 맞추기
		//숫자를 입력해주세요(1.앞면/2.뒷면):1
		//맞췄습니다.
		
		 Scanner sc= new Scanner(System.in);
		 while(true) {
			 System.out.print("숫자를 입력해주세요(1.앞면/2.뒷면) : ");
			 int choice = sc.nextInt();
			 Random rd= new Random();
	//		 int ran=rd.nextInt(2)+1
			 int ran=(int)(Math.random()*10)+1;
			 if(choice==ran) {
				 System.out.println("맞췄습니다.");
			 }else {
				 System.out.println("틀렸습니다.");
			 }
			 
		 }
	}

}
