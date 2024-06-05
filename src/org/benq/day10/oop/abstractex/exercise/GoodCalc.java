package org.benq.day10.oop.abstractex.exercise;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		int add=a+b;
		return add;
	}

	@Override
	public int substract(int a, int b) {
		int substract = a-b;
		return substract;
	}

	@Override
	public double average(int[] a) {
		int sum=0;
		for (int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		double average=sum/a.length;
		return average;
	}

}
