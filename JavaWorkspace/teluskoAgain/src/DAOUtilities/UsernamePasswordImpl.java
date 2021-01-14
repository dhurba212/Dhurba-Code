package DAOUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsernamePasswordImpl  implements DAOUsernamePassword{

	@Override
	public boolean getUsernamePassword(String username,String password) {
		Connection conn=null;
		PreparedStatement ps=null;
		boolean logon=false;
		
		
		try {
			conn=DAOConnection.getConnection();
			
			ps=conn.prepareStatement("select username,password from usernamepassword where username=? and password=?");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				logon=true;
			}
			else
			{
				logon=false;
			}
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
		
		return logon;

	}
	
	public void addUsernamePassword(String username, String password)
	{
		Connection conn=null;
		PreparedStatement ps=null;
		
		try {
			conn= DAOConnection.getConnection();
			
			ps=conn.prepareStatement("insert into usernamepassword values(?,?)");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
