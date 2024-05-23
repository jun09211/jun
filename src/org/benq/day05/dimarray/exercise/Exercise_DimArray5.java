package org.benq.day05.dimarray.exercise;

public class Exercise_DimArray5 {
	public static void main(String[] args) {
		int [][]dimNums=new int[5][5];
		int k=1;
		int z=1;
		//00 01 02 03 04  14 13 12 11 10
		
		for(int i=0;i<dimNums.length;i++) {
			
			if(i%2==1) {
			for(int j=0;j<dimNums[i].length;j++) {
			
				dimNums[i][j]=k;
				k++;
			}
			}else {
				for(int j=dimNums[i].length-1;j>=0;j--) {
					
					dimNums[i][j]=k;
					k++;
				}
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
