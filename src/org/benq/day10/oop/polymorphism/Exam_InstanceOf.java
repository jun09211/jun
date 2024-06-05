package org.benq.day10.oop.polymorphism;

class Car{}
class Sonata extends Car{}
class Genesis extends Car {}
class GV80 extends Car{}

public class Exam_InstanceOf {
	
		
	static void print(Car car) {
		if(car instanceof Sonata) {
			System.out.println("소나타 점프 방방!");
		}else if(car instanceof Genesis) {
			System.out.println("제네시스 스웩 부릉!");
		}else if(car instanceof GV80) {
			System.out.println("GV80 고고싱!");
		}else {
			
		System.out.println("부릉부릉");
		}
	}
	public static void main(String[] args) {
		print(new Car());
		print(new Sonata());
		print(new Genesis());
		print(new GV80());
	}
		
	
}
