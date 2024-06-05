package org.benq.day09.opp.polymorphism;

class Person{
	String name;
	String id;
	
	public Person() {
		
	}
	public Person(String name, String id) {
		this.name=name;
		this.id=id;
	}
	
}
class Student extends Person{
	String grade;
	String department;
	public Student() {}
	
}
class Worker extends Person{
	
}
class Doctor extends Person{
	
}
class SuperClass{
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super Object");
	}
}
class SubClass extends SuperClass{
	void paint() {
		super.paint();
		super.draw();
	}
	void draw() {
		System.out.println("Sub Object");
	}
}
public class Exam_Upcasting {
	public static void main(String [] argd) {
		Person p= new Person();
		Student s= new Student();
		
		p=s;
		p=new Worker();
		p= new Doctor();
		
		SuperClass ex= new SubClass();
		ex.paint();
	}
}
