package DAOUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import teluskoAgain.Student;

public class DAOStudentImpl implements DAOStudent{

	@Override
	public void addStudent(Student student) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			
			conn = DAOConnection.getConnection();
			
			ps=conn.prepareStatement("Insert into student(studentfirstname,studentlastname,schoolid) values(?,?,?)");
			
			ps.setString(1, student.getfName());
			ps.setString(2, student.getlName());
			ps.setInt(3, student.getSchoolId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(conn!=null)
				{
					conn.close();
				}
				if(ps!=null)
				{
					ps.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void deleteStudent(Student student) {
		
		Connection conn=null;
		PreparedStatement ps=null;
		
		try {
			conn=DAOConnection.getConnection();
			ps=conn.prepareStatement("delete from student where studentid=?");
			
			ps.setInt(1, student.getStudentId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try
			{
				if(conn!=null)
				{
					conn.close();
				}
				if(ps!=null)
				{
					ps.close();
				}
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	

}
