package model;

public class Student {
	
	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private int schoolId;
	
	public Student() {};
	
	public Student(String firstname,String lastname)
	{
		this.studentFirstName=firstname;
		this.studentLastName=lastname;
	}
	public Student(int schoolid,String firstname,String lastname)
	{
		this.schoolId=schoolid;
		this.studentFirstName=firstname;
		this.studentLastName=lastname;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	

}
