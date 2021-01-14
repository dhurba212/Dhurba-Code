package dao;

import java.util.List;

import model.School;

public interface schoolDAO {
	List<School> allSchool();
	
	void addSchool(School school);
	
	void deleteSchool(School school);
	

}
