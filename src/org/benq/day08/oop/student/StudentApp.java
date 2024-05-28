package org.benq.day08.oop.student;

public class StudentApp {
	public static void main(String[] args) {
		ManageStudent student = new ManageStudent();
		ViewStudent view = new ViewStudent();
		end:
		while(true) {
			int choice = view.printMenu();
			switch(choice) {
			case 1:
				student.inputScore();
				break;
			case 2:
				student.outputScore();
				break;
			case 3:
				view.displayMsg("프로그램을종료합시다.");
				break end;
			default :
				view.displayMsg("1~3사이의 수를 입력해주세요");
				break;
			}
		}
	}
}
