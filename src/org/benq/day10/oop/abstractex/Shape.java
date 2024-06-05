package org.benq.day10.oop.abstractex;

class Line extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}

public abstract class Shape {
	String name;
	
	public Shape() {}
	public void paint() {}//일반 메소드
	public abstract void draw(); //추상메소드
	
}
