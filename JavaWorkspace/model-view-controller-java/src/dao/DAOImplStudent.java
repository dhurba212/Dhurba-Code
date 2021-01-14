package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class DAOImplStudent implements DAOStudent {

	@Override
	public List<Student> GetAllStudent() {
		List<Student>allstudent=new ArrayList<>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		
		try
		{
			conn=DAOUtilities.getConnection();
			ps=conn.prepareStatement("select * from student");
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				Student student=new Student();
				student.setStudentId(rs.getInt(1));
				student.setfName(rs.getString(2));
				student.setlName(rs.getString(3));
				
				allstudent.add(student);
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
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
				if(rs!=null)
				{
					rs.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		}
		return allstudent;
		
	}

	@Override
	public void AddStudent(Student student) {
		
		
		Connection conn=null;
		PreparedStatement ps=null;
		
		try 
		{
			conn=DAOUtilities.getConnection();
			ps=conn.prepareStatement("insert into student(fname,lname) values(?,?)");
			
			
			ps.setString(1, student.getfName());
			ps.setString(2, student.getlName());
			
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println("Problem connecting to database");
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found exception ");
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
	public void DeleteStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

}
