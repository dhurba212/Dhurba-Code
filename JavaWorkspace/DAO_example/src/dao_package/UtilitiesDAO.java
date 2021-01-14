package dao_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilitiesDAO {
	private static final  String url="jdbc:postgresql://localhost:5432/eZoo";
	private static final String username="postgres";
	private static final String password="password";
	
	public  static Connection getConnection() throws ClassNotFoundException,SQLException 
	{
		Class.forName("org.postgresql.Driver");
		
		//String url="jdbc:postgresql://localhost:5432/eZoo";
		//String username="postgres";
		//String password="password";
		
		Connection conn= DriverManager.getConnection(url, username,password);
		return conn;
	}
	
	
}
