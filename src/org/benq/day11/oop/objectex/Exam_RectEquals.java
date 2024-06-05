package org.benq.day11.oop.objectex;
class Rectangle{
	int width,height;
	
	public Rectangle() {}
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
		
		
	}
	@Override
	public boolean equals(Object obj) {
		Rectangle rect=(Rectangle)obj;//다운캐스팅
		if(width*height==rect.width*rect.height&&width==rect.width) {
		return true;
		}else {
		return false;
		}
	}
}

public class Exam_RectEquals {
	public static void main(String[] args) {
		Rectangle rect1=new Rectangle(5,7);
		Rectangle rect2=new Rectangle(5,7);
		//if(rect1==rect2){}//주소가 다를테니 이렇게 비교는 안됨
		if(rect1.equals(rect2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다");
		}
	}
}
