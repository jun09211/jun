package org.benq.day08.oop.objectarray;

public class Exam_ObjectArray {
	public static void main(String[] args) {
		Circle donut = new Circle(10);
		System.out.println("원의 넓이 : "+ donut.getArea());
		Circle pizza = new Circle(7);
		System.out.println("피자의 넓이 : "+ pizza.getArea());
		
		Circle [] cArrs=new Circle[5];
		cArrs[0]=donut;
		cArrs[1]=pizza;
		System.out.println(cArrs[0].getArea());
		System.out.println(cArrs[1].getArea());
		
	}
	
}
