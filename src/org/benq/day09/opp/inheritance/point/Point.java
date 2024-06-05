package org.benq.day09.opp.inheritance.point;

public class Point {
	protected int pub;
	int def;
	int pro;
	int pri;
	
	private int x,y;
	
	public Point() {
		
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x) {
		this.x=x;
		
	}
	public void setY(int y) {
		
		this.y=y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void showPoint() {
		System.out.printf("%d %d",x,y);
	}
}
