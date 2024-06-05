package org.benq.day10.oop.abstractex.exercise;

public class CalcRun {
	public static void main(String[] args) {
		
		GoodCalc ca= new GoodCalc();
		
		
		System.out.println("합 : "+ca.add(5, 7) );
		System.out.println("차 : "+ca.substract(10, 23) );
		System.out.println("평균 : "+ca.average(new int[] {5,7,10,23}) );
	}
		
	
}
