package model;

public class Student {
	private int studentId;
	private String fName;
	private String lName;
	
	public Student() {};
	
	public Student(String fname,String lname)
	{
		//this.studentId=id;
		this.fName=fname;
		this.lName=lname;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	@Override
	
	public String toString()
	{
		return "Student Id: "+this.studentId+"\n Student first name: "+ this.fName+"\n Student last name: "+this.lName+"]\n";
	}
	
}
