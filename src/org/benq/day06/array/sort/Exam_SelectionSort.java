package org.benq.day06.array.sort;

public class Exam_SelectionSort {
	public static void main(String[] args) {
		/*선택 정렬이란
		 * 배열을 전부 검색하여 최소값을 고르고 왼쪽으로 채워나가는 정렬
		 * 특징 : 데이터 양이 적을때 좋은 성능을 보여주는 정렬
		 * 데이터 양이 많을때는 급격한 성능 저하를 보임.
		 * 배열의 n번 인덱스값을 n+1~마지막인덱스까지 비교함.
		 * {2,5,4,1,3}
		 * 1.{1,5,4,2,3}
		 * 2.{1,2,4,5,3}
		 * 3.{1,2,3,5,4}
		 * 4.{1,2,3,4,5}
		 */
		int min=0;
		int arrs[]= {2,5,4,1,3};
		for(int i=0;i<5; i++) {
			for(int j=i+1;j<5;j++) {
				if(arrs[min]>arrs[j]) {
					//최소값이 나왔을 때, 그때의 자리를 기억하자
					//그때의 인덱스를 기억하자
					min=j;		//최소값이 정해졌을대 min을 arrs[min]으로 구하면 최소값
				}
				
			}
			int temp=arrs[i];
			arrs[i]=arrs[min];
			arrs[min] =temp;
		}
		
		for(int num:arrs) {
			System.out.print(num+" ");
		}
	}
}
