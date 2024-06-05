package org.benq.day09.opp.overriding;

public class Exam_Overrriding {
	
	static void paint(Shape shape) {
		//Shape shape =new Shape();
		//Shape shape= new Circle();
		//Shape shape= new Line();
		//Shape shape= new Rectangle();
		
		shape.draw();
	}
	public static void main(String[] args) {
		
		Shape shape= new Shape();
		paint(shape);
		Circle circle=new Circle();
		paint(circle);
		Line line= new Line();
		paint(line);
		Rectangle rect= new Rectangle();
		paint(rect);
		
		
		/*
		 * 오버라이딩
		 * 1.오버라이딩은 상속관계에서 사용
		 * 2.오버라이딩은 다 똑같고(접근지정자, 
		 * 실행문장만 재정의한것
		 * 3.오버라이딩이 되면 동적 바이딩
		 */
//		Shape shape = new Shape();
//		shape.draw();
//		Circle circle=new Circle();
//		circle.draw();
//		Line line = new Line();
//		line.draw();
//		Rectangle rect= new Rectangle();
//		rect.draw();
	}
}
