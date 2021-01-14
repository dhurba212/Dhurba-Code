package dao;

import java.util.List;

import model.Student;

public interface studentDAO {
	List<Student>getAllStudent();
	
	void addStudent(Student student);
	
	void deleteStudent(int studentid);

}
