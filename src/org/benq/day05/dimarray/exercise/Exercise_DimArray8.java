package org.benq.day05.dimarray.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_DimArray8 {
	public static void main(String[] args) {
		Random Random=new Random();
		Scanner sc= new Scanner(System.in);
		System.out.print("가로의 개수를 입력 하세요(1~10) : ");
		
		int row=sc.nextInt();
		if(row>10||row<1) {
			System.out.print("10보다 작고 1보다 크게 입력하세요.");
			return;
		}
		System.out.print("세로의 개수를 입력 하세요(1~10) : ");
		
		int col=sc.nextInt();
		if(col>10||col<1) {
			System.out.print("10보다 작고 1보다 크게 입력하세요.");
			return;
		}
		char [][] alphabet= new char[row][col];
		int num;
		for(int i=0; i<col;i++) {
			for(int j=0; j<row; j++) {
				num=Random.nextInt(26)+97;
				alphabet[i][j]=(char)num;
			}
		}
		for(int i=0; i<col;i++) {
			for(int j=0; j<row; j++) {
				System.out.print(alphabet[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	

}
