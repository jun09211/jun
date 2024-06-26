package org.benq.day14.javaapi;

public class Exam_String {
	public static void main(String[] args) {
		String msg="Hello Java";
		msg= new String("Hello java");//주소 무조건 새로이 생성
		
		String data1= new String("C#");
		String data2=new String("c++");
		System.out.println(data1+"의 길이는 "+data1.length());
		System.out.println(data1+"의 길이는 "+data2.length());
		
		//문자열 포함되어 있는지 체크
		System.out.println("#이 있는가 ? : "+data1.contains("#"));
		
		//문자열 연결
		// C#,c++
		data1=data1.concat(data2);
		System.out.println("연결된 문자열 : "+data1);
		
		//문자열 공백 제거
		data1=data1.trim();
		System.out.println("공백 제거 확인 : "+data1);
		//문자열 교체 C#->JAVA
		data1=data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 확인 : "+data1);
		//문자열 썰기 1- 기준 잡고 썰어줌
		String [] words=data1.split(",");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]+" / ");
		}
		for(String word:words) {
			System.out.println(word+" / ");
		}
		System.out.println();
		
		//문자열 썰기 2 - 인덱스로 썰어줌
		data1=data1.substring(4);
		System.out.println("문자열 자르기 : "+data1);
		data1=data1.substring(0, 4);
		System.out.println("문자열 자르기 : "+data1);
		//문자열->문자로 만들기
		char word = data1.charAt(0);
		System.out.println("문자열 자르기 : "+word);
		
	}
}
