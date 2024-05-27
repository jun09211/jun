package org.benq.day07.oop.exercise;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	public Suit(int size) {
		this(size,"Hazzys"); //12번줄호출
		System.out.println("suit(int)호출 !!");
	}
	public Suit(int size,String brand) {
		this(size,brand,100000); // 16번줄 호출
		System.out.println("suit(int String)호출");
	}
	public Suit(int size, String brand,int price) {
	this.size=size;
			this.brand=brand;
			this.price=price;
			System.out.println("Suit(int,String)호출");
	}

}
