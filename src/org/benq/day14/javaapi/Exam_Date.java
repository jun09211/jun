package org.benq.day14.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat trans =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//시분초
		SimpleDateFormat trans2 =new SimpleDateFormat("yyyy/MM/dd HH:ss:SS");//시분초
		
		String tranDate1=trans.format(date);
		String tranDate2=trans2.format(date);
		
		System.out.println("형식 변환 1 : "+tranDate1);
		System.out.println("형식 변환 2 : "+tranDate2);
		
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		String changed=trans.format(calendar.getTime());
		System.out.println("그래고리안 달력 날짜 변환"+changed);
	}
}
