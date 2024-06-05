package org.benq.day10.oop.interfacex;

public class Exam_Interface {
	public static void main(String[] args) {
		
		PhoneInterFace phone=new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
	}
}
