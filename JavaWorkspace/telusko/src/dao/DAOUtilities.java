package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;

public class DAOUtilities {
	
	
	private static String url="jdbc:postgresql://localhost:5432/Example";
	private static String username="postgres";
	private static String password="password";
	private static Connection connection=null;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("org.postgresql.Driver");
		connection= DriverManager.getConnection(url,username,password);
		return connection;
	}
	

}
