package org.benq.day06.array.sort.exercise;

import java.util.Random;
import java.util.Scanner;

public class Customer3 {
	public static void main(String[] args) {
		Random rd= new Random();
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.print("배열의 크기 입력 : ");
		int num=sc.nextInt();
		int nums[]= new int[num];
		
		

		
		for(int i=0; i<nums.length;i++) {
			
			int ran=rd.nextInt(100)+1;
			nums[i]=ran;
			sum+=nums[i];
			for(int j=i-1;j>=0;j--) {
				if(nums[j]==ran) {
					sum-=nums[i];
					i--;
					
				}				
			}
			
		}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		System.out.print("sum : "+sum);
		
	}
}
