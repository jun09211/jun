package org.benq.day05.dimarray.exercise;

public class Exercise_DimArray3 {
	public static void main(String[] args) {
		int [][]dimNums=new int[5][5];
		int k=1;
		
		
		
		for(int i=0;i<dimNums.length;i++) {
			for(int j=dimNums[i].length-1;j>=0;j--) {
				dimNums[j][i]=k;
				k++;
			}
		}
		for (int i=0;i<dimNums.length;i++) {
			for(int j=0;j<dimNums[i].length;j++) {
				System.out.print(dimNums[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
