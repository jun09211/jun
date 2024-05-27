package org.benq.day06.array.sort;

public class Exam_ArraySort {
	public static void main(String[] args) {
		//정렬
		//크기가 5인 배열이 있고 24 5 7 10 23
		// 7 24 5 23 10 -> 5 7 10 23 24
		/*01.정렬 알고리즘
		 * -알고리즘이란 문제해결으 ㄹ하기위한 절차나 방법
		 * 프로그래밍 언어로 어떻게 해결할 것인가를 고민해 가는 것
		 * 02. 정렬 알고리즘 종류
		 * 1. 삽입정렬
		 * 2. 선택정렬
		 * 3. 버블정렬
		 * 4. 퀵정렬
		 * 5. 병합정렬
		 * 7 24 5 23 10 -> 5 7 10 23 24
		 * 자리바꿈 발생!
		 * 1. 자리바꿈은 어떻게 해결할 것인가?
		 * 2. 어떤 조건이 만족하면 바꿀것인가?
		 */
		int num1=5;
		int num2=7;
		
		System.out.printf("num1 : %d, num2 : %d\n",num1,num2);
		int temp=num1;
		num1 = num2;
		num2 = temp;
		System.out.printf("num1 : %d, num2 : %d\n",num1,num2);
		int k=0;
		int nums[]= {2,1,3};
		for(int i=0;i<3;i++) {
			for (int j=k;j<3;j++){  
				if(nums[i]<nums[j]) {					
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}else {}				
			}
			k+=1;//1			
		}
		System.out.printf("nums1 : %d, nums2 : %d, nums3 : %d\n",nums[0],nums[1],nums[2]);
		
		
	}
}
