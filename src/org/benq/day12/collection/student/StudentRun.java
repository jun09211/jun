package org.benq.day12.collection.student;
import java.util.List;
import java.util.Map;
public class StudentRun {
	public static void main(String[] args) {
		ManageStudent mng=new ManageStudent();
		ViewStudent view=new ViewStudent();
		끝:
		while(true) {
			int input =view.printMenu();
			switch(input) {
			case 1:
				Student std=view.inputStudent();
				mng.registerStudent(std);
				break;
			case 2:
				String name=view.inputName("검색");
				List<Student> sList=mng.searchListByname(name);
				view.displayStudents(sList);
				break;
			case 3:
				List<Student> stdList=mng.selectAllStudents();
				if(stdList.size()>0)
					view.displayStudents(stdList);
				else
					view.displayMsg("회원정보가 없습니다.");
				break;
			case 4:
				name= view.inputName("수정");
//				Student student=mng.searchModifyStudent(name);
//				student=view.modifyStudent(student);
//				int index=mng.searchIndexbyName(name);
//				Student student=mng.searchModifyStudent(name);
				Map<String,Object> result =mng.searchModifyStudent(name);
				Student student = view.modifyStudent((Student)result.get("student"));
				mng.modifyStudent((int)result.get("index"), student);
				break;
			case 5:
				name=view.inputName("삭제");
				int index=mng.searchIndexbyName(name);
				mng.deleteStudent(index);
				break;
			case 6:
				name = view.inputName("재평가 여부를 확인");
				student =mng.searchOneByname(name);
				String passResult=mng.checkPass(student);
				view.displayMsg(passResult);
				break;
			case 0:
				view.displayMsg("프로그램을 종료합니다.");
				break 끝;
			default :
				view.displayMsg("1~3사이의 수를 입력해주세요.");
			}
		}
	}
}
