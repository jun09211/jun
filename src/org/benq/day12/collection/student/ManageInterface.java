package org.benq.day12.collection.student;

import java.util.List;

public interface ManageInterface {
	void registerStudent(Student student);
	List<Student> searchListByname(String name);
	Student searchOneByname(String name);
	
	List<Student> selectAllStudents();
	
	void modifyStudent(int index,Student student);
	
	void deleteStudent(int index);
}
