package org.benq.day10.oop.interfacex;

public interface PhoneInterFace {
/*
 * 인터페이스는 상수형 필드만 가능
 * 추상메소드만 구성됨
 * 
 */
	public static final int TIME_OUT=10000;
//	publci String name;;//일반필드사용불가
	
	public abstract void printLogo();
//	public void sendCall() {}; //
	void sendCall();
	
	public default void showLogo() {
		
	}
}
