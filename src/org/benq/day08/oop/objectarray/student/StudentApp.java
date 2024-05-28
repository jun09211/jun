package org.benq.day08.oop.objectarray.student;

import java.util.Scanner;

import org.benq.day08.oop.objectarray.Book;

public class StudentApp {
	
	public static void main(String[] args) {
//		ManageStudent student = new ManageStudent();
//		 [] st= new ManageStudent[3];
//		
//		for(int i=0;i<3;i++) {
//			int choice = student.printMenu();
//			
//			if(choice==1) {
//				student.inputScore();
//				
//				st[i]=new ManageStudent(name,firstScore,secondScore);
//			}
//			else if(choice==2) {
//				student.outputScore();
//			}
//			else if(choice==3) {
//				student.displayMsg("프로그램을종료합시다.");
//			}
//			else {
//				student.displayMsg("1~3사이의 수를 입력해주세요");
//			}
//		}
		ManageStudent mng = new ManageStudent();
		ViewStudent view = new ViewStudent();
		exit:
		while(true) {
			int input = view.printMenu();
			switch(input) {
			case 1:
				//inputInfo();
				Student [] students = view.displayInput();
				mng.inputInfo(students);
				break;
			case 2:
				students=mng.printInfo();
				view.displayInfo(students);
				break;
			case 3:
				view.displayMsg("프로그램을 종료합니다.");
				break exit;
			default :
				view.displayMsg("1~3 사이의 숫자를 입력해주세요.");
			}
		}
	}


}
