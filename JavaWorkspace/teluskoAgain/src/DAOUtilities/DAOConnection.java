package DAOUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DAOConnection {
	
	private static String url="jdbc:postgresql://localhost:5432/Example";
	private static String username="postgres";
	private static String password="password";
	private static Connection connection=null;
	
	public static Connection getConnection() throws SQLException
	{
		
		try
		{
			Class.forName("org.postgresql.Driver");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Problem with the postgrsql Driver");
			e.printStackTrace();
		}
		
		
			connection=(Connection) DriverManager.getConnection(url, username, password);
		
		
		
		
		
		return connection;
	}
	
	public static DAOStudent getDAOStudentImpl()
	{
		DAOStudent daostudent=new DAOStudentImpl();
		
		return daostudent;
	}
	
	public static DAOUsernamePassword getUsernamePassword()
	{
		DAOUsernamePassword daoup= new UsernamePasswordImpl();
		
		return daoup;
	}
	
	

}
