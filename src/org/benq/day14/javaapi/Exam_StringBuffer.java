package org.benq.day14.javaapi;

public class Exam_StringBuffer {
	public static void main(String[] args) {
		String data1="Hello";
		String data2=" ";
		String data3="JAVA";
//		data1= data1+data2+data3;
//		data1=data1.concat(data2).concat(data3);
		System.out.println("연결된 문자열 :"+data1);
		
		//String Buffer 이용해서 연결(메모리 절약)
		StringBuffer stb=new StringBuffer();
		stb.append(data1).append(data2).append(data3);
		System.out.println("연결된 문자열 :"+stb.toString());
		
	}
}
