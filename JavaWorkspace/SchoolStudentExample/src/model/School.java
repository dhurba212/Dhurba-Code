package model;

public class School {
	
	private int schoolId;
	private String schoolName;
	private String state;
	private String city;
	
	public School() {};
	
	public School(int schoolid,String schoolname,String state,String city)
	{
		this.schoolId=schoolid;
		this.schoolName=schoolname;
		this.state=state;
		this.city=city;
	}
	
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
