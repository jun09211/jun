package org.benq.day06.array.sort.exercise;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int nums[]= new int[5];
		int sum=0;
		for(int i=0;i<5;i++) {
			System.out.print(i+1+"번재 정수를 입력해주세요 : ");
			nums[i]=sc.nextInt();
		}
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0; j<nums.length-1-i;j++) {
				if(nums[j]>nums[j+1]) {
					int temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
			}
			
		}
		for(int i=0;i<5;i++) {
			if(i==0||i==4) {
				sum+=nums[i];
			}
			System.out.print(nums[i]+" ");
			
		}
		System.out.println();
		System.out.print("정렬 후 첫번째 수와 마지막수의 합 : "+sum);
	}
}
