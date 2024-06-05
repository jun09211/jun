package org.benq.day09.opp.encapsulation;

public class Student {
	private String name;
	private int firstScore;
	private int secondScore;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore=firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore=secondScore;
	}
	
	public String getName() {
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}
	
	
	public Student() {
		
	}
	public Student(String name, int firstScore,int secondScore) {
		this.name=name;
		this.firstScore=firstScore;
		this.secondScore=secondScore;
	}
	public String toString() {
		return this.name+"학생의 첫번째 점수는"
				+this.firstScore+"점, 두번째 점수는"
				+this.secondScore+"점 입니다.";
		
	}
	
}
