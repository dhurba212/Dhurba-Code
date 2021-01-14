package dao;

import java.util.ArrayList;
import java.util.List;

import model.Student;

public interface DAOStudent {
	public List<Student> GetAllStudent();
	
	public void AddStudent(Student student);
	
	public void DeleteStudent(Student student);

}
