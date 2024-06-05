package org.benq.day09.opp.inheritance.point;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint() {
		super();  	//this()처럼 생성자 호출하는데 부모의 생성자 호출함.
					//상속받은경우 부모의 생성자 호출함.
	}
		public ColorPoint(int x, int y, String color) {
			super(x,y);
			this.color=color;
		}
		public void showColorPoint() {
			super.showPoint();
			System.out.println(this.color+"색의 점입니다.");
		}
		
	
}
