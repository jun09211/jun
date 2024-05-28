package org.benq.day08.oop.score;
import org.benq.day08.oop.score.Student;
public class ScoreProgram3 {
	public static void main(String[] args) {
		Student student = new Student();
		
		while(true) {
			int choice = student.printMenu();
			switch(choice) {
			case 1:
				student.inputScore();
			case 2:
				student.outputScore();
			case 3:
				student.displayMsg("프로그램을종료합시다.");
			default :
				student.displayMsg("1~3사이의 수를 입력해주세요");
			}
		}
	}
}
