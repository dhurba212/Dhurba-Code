package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DAOUtilities;
import dao.SchoolDOAImp;
import dao.StudentDAOImpl;

public class Main {
	public static void main(String[] args) {
		//Student newStudent=new Student("Sangita","Dhakal");
		
		StudentDAOImpl studentdaoimpl=new StudentDAOImpl();
		//SchoolDOAImp schooldaoimp =new SchoolDOAImp();
		//studentdaoimpl.addStudent(newStudent);
		
		
		//School newSchool= new School(1,"Readers School","Ohio","Colombus");
		//schooldaoimp.addSchool(newSchool);
		studentdaoimpl.deleteStudent(4);
		/*
		Connection conn=null;
		PreparedStatement ps=null;
		PreparedStatement ps2=null;
		try
		{
			conn=DAOUtilities.getConnection();
			ps = conn.prepareStatement("insert into student values(?,?,?)");
			
			ps2= conn.prepareStatement("select * from student order by studentid desc limit 1");
			ResultSet rs=ps2.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("studentid"));
			}
			
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
			
		}*/
	}

}
