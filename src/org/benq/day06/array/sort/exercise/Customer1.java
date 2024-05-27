package org.benq.day06.array.sort.exercise;

import java.util.Random;
import java.util.Scanner;

public class Customer1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rd= new Random();
		String select;
		
		System.out.println("가위 바위 보 게임을 시작합니다.");
		while(true) {
			System.out.print("가위 바위 보 중 한개를 입력하세요 : ");
			select=sc.next();
			if(select.equals("가위")) {
				
				System.out.println("당신은 가위를 냈습니다.");
			}else if(select.equals ("바위")) {
				
				System.out.println("당신은 바위를 냈습니다.");
			}else if(select.equals ("보")) {
				
				System.out.println("당신은 보를 냈습니다.");
			}
			int ran=rd.nextInt(3);
			if(ran==0) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
			}else if(ran==1) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
			}else if(ran==2) {
				System.out.println("컴퓨터는 보를 냈습니다.");
			}
			if(select.equals("가위")) {
				if(ran==0) {
					System.out.println("비겼습니다. 다시 시작합니다.");
					continue;
				}else if(ran==1) {
					System.out.println("당신이 졌습니다.!");
					break;
				}else {
					System.out.println("당신이 이겼습니다.!");
					break;
				}
			}
			if(select.equals ("바위")) {
				if(ran==0) {
					System.out.println("당신이 이겼습니다.!");
					break;
				}else if(ran==1) {
					
					System.out.println("비겼습니다. 다시 시작합니다.");
					continue;
				}else {
					System.out.println("당신이 졌습니다.!");
					
					break;
				}
			}
			if(select.equals ("보")) {
				if(ran==0) {
					System.out.println("당신이 졌습니다.!");
					break;
				}else if(ran==1) {
					System.out.println("당신이 이겼습니다.!");
					
					break;
				}else {
					System.out.println("비겼습니다. 다시 시작합니다.");
					continue;
				}
			}
		}
	}
}
