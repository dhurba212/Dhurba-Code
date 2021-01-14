package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


//3rd way of validating login. create this class and pass it to LoginServlet.
public class DAOLogin {
	
	public static boolean checkLogin(String user,String pass)
	{
		boolean match=true;
		try 
		{
			String sql="select * from usernamepassword where username=?, password=?";
			Connection conn=DAOUtilities.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pass);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				match= true;
			}
			else
			{
				match=false;
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return match;
		
	}

}
