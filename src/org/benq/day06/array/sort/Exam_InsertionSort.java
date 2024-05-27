package org.benq.day06.array.sort;

public class Exam_InsertionSort {
	public static void main(String[] args) {
		/*
		 * 삽입정렬
		 * 정렬알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		 * 배열의 N번의 인덱스 값을 0번에 n-1번 인덱스 까지 비교~!
		 * n은 1부터 시작
		 * {2,5,4,1,3}
		 * 
		 * i=1
		 * j=0
		 * arrs[1] arrs[0] 비교
		 * arrs[0]이 크면 교환
		 * i=2
		 * j=0,1
		 * arrs[2]와 arrs[1],arrs[0] 비교
		 * 5와 2 비교-> 교환 x
		 * 4와 비교 시작 
		 * 4와 2 비교 -> 교환 x
		 * 4와 5 비교 -> 교환
		 * 결과 2,4,5,1,3
		 * 세번째 : 1과 5비교 -> 교환
		 * 		  1과 4비교 -> 교환
		 * 	      1과 2비교 -> 교환
		 * 1,2,4,5,3
		 * 3과 비교
		 * 결과 1,2,3,4,5
		 * 
		 */
		int arrs[]= {2,5,4,1,3};
		for (int i=1; i< arrs.length; i++) {
			for (int j=i;j>=1;j--)
			if(arrs[j-1]>arrs[j]) {
				int temp= arrs[j];
				arrs[j]=arrs[j-1];
				arrs[j-1]=temp;
			}
			
		}
		for(int i=0;i<5;i++) {
			System.out.print(arrs[i]+" ");
		}
		
	}

}
