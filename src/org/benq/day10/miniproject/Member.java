package org.benq.day10.miniproject;

import java.time.LocalDate;

public class Member {
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String memberEmail;
	private String memberPhone;
	private String memberAddress;
	private double memberWeight [] =new double[50];
	private LocalDate memberDate [] = new LocalDate[50];
	private double memberWeight2;
	private LocalDate memberDate2;
	public Member() {}
	
	public void setMemberId(String memberId) {
		this.memberId=memberId;
	}
	public String getMemberId() {
		return this.memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public double[] getMemberWeight() {
		return memberWeight;
	}

	public void setMemberWeight(double memberWeight[]) {
		this.memberWeight = memberWeight;
	}

	public LocalDate[] getMemberDate() {
		return memberDate;
	}

	public void setMemberDate(LocalDate memberDate[]) {
		this.memberDate = memberDate;
	}

	public void setMemberWeight(double d) {
		// TODO Auto-generated method stub
		this.memberWeight[0] = d;
		
	}

	public void setMemberDate(LocalDate localDate) {
		// TODO Auto-generated method stub
		this.memberDate[0] = localDate;
	}

	public double getMemberWeight2() {
		return memberWeight2;
	}

	public void setMemberWeight2(double memberWeight2) {
		this.memberWeight2 = memberWeight2;
	}

	public LocalDate getMemberDate2() {
		return memberDate2;
	}

	public void setMemberDate2(LocalDate memberDate2) {
		this.memberDate2 = memberDate2;
	}




}
