package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOUtilities {
	
	private static String url="jdbc:postgresql://localhost:5432/mvc";
	private static String username="postgres";
	private static String password="password";
	private static Connection conn=null;
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException {
		Class.forName("org.postgresql.Driver");
		
		conn=DriverManager.getConnection(url,username,password);
		return conn;
	}

}
