package org.benq.day05.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
		int num=0;//변수
		int [] nums= new int[10];//배열
		int [][]dimNums = new int[4][4];//2차원 배열
		System.out.println("행의 길이 : "+dimNums.length);
		System.out.println("열의 길이 : "+dimNums[0].length);
		int [][] arrs = new int[4][4];
		int k=1;
		for (int i=0;i<arrs.length; i++) {
			for (int j=0; j<arrs[i].length; j++) {
				arrs[i][j]=k;
				k++;
			}
		}
		for(int i=0; i<arrs.length;i++) {
			for(int j=0; j<arrs[i].length;j++) {
				System.out.print(arrs[i][j]+"\t");
				
			}
			System.out.println();
		}
		// for -each로 출력
		for(int [] arr: arrs) {
			for(int j : arr) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
