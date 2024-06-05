package org.benq.day12.collection.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageStudent implements ManageInterface{
	private List<Student> sList;
	
	public ManageStudent() {
		sList=new ArrayList<Student>();
	}
	
	@Override
	public void registerStudent(Student student) {
		// TODO Auto-generated method stub
		sList.add(student);
	}

	@Override
	public List<Student> searchListByname(String name) {
		if(name!=null) {
			List<Student> searchList=new ArrayList<Student>();
			for(Student std:sList) {
				if(name.equals(std.getName())) {
					//찾았다.
					searchList.add(std);
				}
			}
			return searchList;
		}
		return null;
	}
	public Student searchOneByname(String name) {
		if(name!=null) {
			List<Student> searchList=new ArrayList<Student>();
			for(Student std:sList) {
				if(name.equals(std.getName())) {
					//찾았다.
					return std;
				}
			}
			
		}
		return null;
	}


	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return sList;
	}

	@Override
	public void modifyStudent(int index, Student student) {
		// TODO Auto-generated method stub
		sList.set(index,student);
	}

	@Override
	public void deleteStudent(int index) {
		// TODO Auto-generated method stub
		sList.remove(index);
	}

	public Map<String,Object> searchModifyStudent(String name) {
		if(name!=null) {
			Map<String,Object> result=new HashMap<String,Object>();
			for (int i=0;i<sList.size();i++) {		//전체에서
				Student student=sList.get(i);
				if(name.equals(student.getName())) {//이름이 같으면
					result.put("student", student);
					result.put("index", i);
					return result;
					
				}
			}
		}
		return null;
	}

	public int searchIndexbyName(String name) {
		if(name!=null) {
			int count=0;
			for(Student student : sList) {//sList에서
				if(name.equals(student.getName())) {//이름이 같으면
					return count;
				}
				count++;
			}
		}
		return 0;
	}

	public String checkPass(Student student) {
		int first=student.getFirstScore();
		int second=student.getSecondScore();
		//평균 60점이넘으면 통과
		//평균 60점이 안되면 재평가
		double avg=(first+second)/(double)2;
		if(avg>=60) {
			if(first<40) {
				return "1차 시험 재평가";
			}else if(second<40) {
				return "2차 시험 재평가";
			}else {
				return "모두 통과입니다.";
			}
			
		}else {
			String result="";
			if(first<60) {
				result += "1차 시험 재평가";
			}
			if(second<60) {
				result += "2차 시험 재평가";
			}
			return result;
		}
		
	}

}
