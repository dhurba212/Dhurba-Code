package model;

public class Student {
	
	private int studentid;
	private String firstName;
	private String lastName;
	private int schoolId;
	
	public Student(int studentid, String firstName, String lastName, int schoolId) {
		super();
		this.studentid = studentid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.schoolId = schoolId;
	}

	
	
	public Student() {}
	
	

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}



	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", firstName=" + firstName + ", lastName=" + lastName + ", schoolId="
				+ schoolId + "]";
	}

}
