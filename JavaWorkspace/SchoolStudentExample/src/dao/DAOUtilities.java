package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOUtilities {
	private static String url="jdbc:postgresql://localhost:5432/Example";
	private static String username="postgres";
	private static String password="password";
	private static Connection conn;
	public static Connection getConnection() throws SQLException
	{
		
		try
		{
			Class.forName("org.postgresql.Driver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class couldnt connect to the driver");
			e.printStackTrace();
		}
		
		
		conn=DriverManager.getConnection(url,username,password);
			
		
		
		return conn;
	}

}
