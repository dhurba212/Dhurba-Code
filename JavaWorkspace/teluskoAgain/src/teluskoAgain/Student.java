package teluskoAgain;

public class Student {

		int StudentId;
		String fName;
		String lName;
		int SchoolId;
		
		public Student() {
			
		}
		
		public Student(String fname,String lname,int schoolid)
		{
			this.fName=fname;
			this.lName=lname;
			this.SchoolId=schoolid;
		}
		
		public int getStudentId() {
			return StudentId;
		}
		public void setStudentId(int studentId) {
			StudentId = studentId;
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
		public void setlName(String lname) {
			lName = lname;
		}
		public int getSchoolId() {
			return SchoolId;
		}
		public void setSchoolId(int schoolId) {
			SchoolId = schoolId;
		}
		@Override
		public String toString() {
			return "Student [StudentId=" + StudentId + ", fName=" + fName + ", Lname=" + lName + ", SchoolId="
					+ SchoolId + "]";
		}
}
