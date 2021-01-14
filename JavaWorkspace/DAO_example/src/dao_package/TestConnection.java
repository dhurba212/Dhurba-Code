package dao_package;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class TestConnection {
	public static void main(String[] args) {
		try 
		{
			Connection conn=UtilitiesDAO.getConnection();
			DatabaseMetaData meta= conn.getMetaData();
			System.out.println(meta.getDatabaseProductName());
			conn.close();
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
