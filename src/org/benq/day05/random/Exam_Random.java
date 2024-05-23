package org.benq.day05.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String[] args) {
		Random rand= new Random();
		
		//for(int i=0; i<10; i++) {
//		int num = rand.nextInt(10);
//		System.out.println(num);
		//25부터 35사이의 랜덤한수를 출력
//		num = rand.nextInt(11)+25;
//		System.out.println(num);
		/// 1또는 2
//		num = rand.nextInt(2)+1;
//		System.out.println(num);
		
		//}
		//1~10사이의 랜덤한 수를 구하시오
//		num = rand.nextInt(10)+1;
//		System.out.println(num);
		for(int i=0;i<100;i++) {
			int randNum=(int)(Math.random()*10);
			System.out.println(randNum);
			
//			randNum=(int)(Math.random()*11)+25;
//			System.out.println(randNum);
					
		}
	}
}
