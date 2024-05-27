package org.benq.day07.oop;

public class Circle {

		public double radius;
		public String name;
		public final double PI = 3.14;
		public void setRadius(double radius) {
			this.radius = radius;
		}
		public double getarea() {
			return PI*this.radius*this.radius;
		}
		
		
		
}
