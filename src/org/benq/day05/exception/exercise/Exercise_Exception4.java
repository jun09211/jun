package org.benq.day05.exception.exercise;

import java.util.Scanner;

public class Exercise_Exception4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String [] words= {"507","10.23",""};
		
		try {
			int result = Integer.parseInt(words[0]);
			System.out.print(result);
			
//			int result2= Integer.parseInt(words[1]);
//			System.out.print(result2);
			
			int result3= Integer.parseInt(words[2]);
			System.out.print(result3);
			
		}catch (NumberFormatException e) {
			System.out.println("해당 문자열은 정수로 변환할수 없습니다.");
		}
		
		
		
		
	}

}
