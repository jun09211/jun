package org.benq.day09.opp.encapsulation;

public class Circle {

		private double radius;
		private  String name;
		
		public void setRadius(double radius) {
			this.radius=radius;
		}
		public void setName(String name) {
			this.name=name;
		}
		public double getRadius() {
			return this.radius;
		}
		public String getName() {
			return this.name;
		}
		
		
		public final double PI = 3.14;
//		public void setRadius(double radius) {
//			this.radius = radius;
//		}
		public double getarea() {
			return PI*this.radius*this.radius;
		}
		
		
		
}
