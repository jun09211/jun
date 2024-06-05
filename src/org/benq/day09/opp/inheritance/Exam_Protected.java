package org.benq.day09.opp.inheritance;

import org.benq.day09.opp.inheritance.point.Point;

class Super{
	public int pub;
	int def;
	protected int pro;
	int pri;
}

class Sub extends Super{
	void set() {
		Super sup=new Super();
		sup.pro=507;
		super.pub=24;
		super.def=5;
		super.pro=7;
	}
}

class ShapePoint extends Point{
	void set() {
		Point p=new Point();
//		p.pub=24;
//		p.def=57; default는 같은 패키지에서만 가능
//		p.pro=10;//protected는 같은 패키지 또는 상속일때 가능
//		p.pri=23;//당연히 안됨 private
		super.pub=2024;
//		super.pro=23;
		
	}
}
public class Exam_Protected {

}
