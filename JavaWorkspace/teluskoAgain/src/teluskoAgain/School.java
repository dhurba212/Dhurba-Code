package teluskoAgain;

public class School {
	
	String SchoolId;
	String SchoolName;
	public String getSchoolId() {
		return SchoolId;
	}
	public void setSchoolId(String schoolId) {
		SchoolId = schoolId;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	@Override
	public String toString() {
		return "School [SchoolId=" + SchoolId + ", SchoolName=" + SchoolName + "]";
	}
	

}
