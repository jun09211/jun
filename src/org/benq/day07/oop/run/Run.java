package org.benq.day07.oop.run;
import java.util.Scanner;
import org.benq.day07.oop.Book;
import org.benq.day07.oop.Circle;
import org.benq.day07.oop.Rectangle;
import org.benq.day07.oop.Member;
public class Run {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
//			Run ex= new Run();
			Run.ooPractice1();
//			Math.random();
			oopExercise();
			
	}
		
		public void constructorEx() {
			Book book =new Book("춘항뎐","작자미상");
			Book emptyBook = new Book();
			
			Circle bintz = new Circle();
			bintz.setRadius(10);
		}
		public static void ooPractice1() {
			Rectangle rec = new Rectangle();
			rec.height=4;
			rec.width=5;
			int area1 = rec.getArea();
			System.out.println("사각형의 넓이는 20 입니다."+area1);
			System.out.print(">>"+rec.height+" "+ rec.width+"\n");
			//heap영역
			Scanner sc1= new Scanner(System.in);
			int width=sc1.nextInt();
			int height=sc1.nextInt();
			int result = width*height;
			System.out.println("사각형의 넓이는 "+result+"입니다");
			//stack 영역
			
		}
		
		public static void oopExercise() {
			//Circle의 instance 를 이용하여
			//이름을 달덩이, 반지름은 5인
			//Circle 의 넓이를 출력해보세요
			Circle circle = new Circle();
			circle.name="달덩이";
			circle.radius=5;
			double area=circle.getarea();
			circle.getarea();
			System.out.println(area);
		}
		
		public static void memberPractioce() {
			Member member = new Member();//생성자
			member.name="일용자";
			member.age=33;
			member.job="의사";
			Member member2=new Member();
			member2.name="이용자";
			member2.age=22;
			System.out.println(member.name);
			System.out.println(member.job);
		}

}
