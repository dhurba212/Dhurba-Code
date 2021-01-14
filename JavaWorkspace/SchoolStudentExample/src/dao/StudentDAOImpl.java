package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.School;
import model.Student;

public class StudentDAOImpl implements studentDAO{

	@Override
	public List<Student> getAllStudent() {
		
		Connection conn=null;
		PreparedStatement ps=null;
		List<Student>studentlist=new ArrayList<>();
		try
		{
			conn=DAOUtilities.getConnection();
			
			ps=conn.prepareStatement("select * from student");
			ResultSet rs= ps.executeQuery();
			
			Student student=new Student();
			while(rs.next())
			{
				student.setStudentId(rs.getInt("studentid"));
				student.setStudentFirstName(rs.getString("firstname"));
				student.setStudentLastName(rs.getString("lastname"));
				
				studentlist.add(student);
				
			}
			
		}
		catch(SQLException e)
		{
			System.out.println("problem with connection");
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if (conn!=null)
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
		
		return studentlist;
		
	}

	@Override
	public void addStudent(Student student) {
		
		Connection conn=null;
		PreparedStatement ps=null;
		PreparedStatement ps2=null;
		try
		{
			conn=DAOUtilities.getConnection();
			ps = conn.prepareStatement("insert into student values(?,?,?)");
			
			ps2= conn.prepareStatement("select * from student order by studentid desc limit 1");
			ResultSet rs=ps2.executeQuery();
			int studentid=0;
			if(rs.next())
				{
					studentid=rs.getInt("studentid");
				}
			
			ps.setInt(1,(studentid+1));
			ps.setString(2,student.getStudentFirstName());
			ps.setString(3,student.getStudentLastName());
			
			ps.executeUpdate();
			
		}
		catch(SQLException e)
		{
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
				if(ps2!=null)
				{
					ps2.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		}
		
		
	}

	@Override
	public void deleteStudent(int thisstudentId) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		
		try
		{
			conn=DAOUtilities.getConnection();
			ps = conn.prepareStatement("delete from student where studentid="+thisstudentId);
			
			
			
		
			
			ps.executeUpdate();
			
		}
		catch(SQLException e)
		{
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

	

}
