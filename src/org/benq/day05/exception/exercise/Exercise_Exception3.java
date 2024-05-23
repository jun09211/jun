package org.benq.day05.exception.exercise;

public class Exercise_Exception3 {
	public static void main(String[] args) {
		int a[]= new int[5];
		int k=1;
		
//		while(true) {
			try {
				for(int i=0; i<=4;i++) { // 5이상일시 배열값에 벗어남
				a[i]=k;
				k++;
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배열 값을 벗어났습니다.");
				
			}
			for(int i=0;i<5;i++) {
				System.out.print(a[i]+" ");
			}
//		}
		

	}

}
