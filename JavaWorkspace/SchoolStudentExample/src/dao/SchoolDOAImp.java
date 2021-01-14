package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.School;

public class SchoolDOAImp implements schoolDAO{

	@Override
	public List<School> allSchool() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSchool(School school) {
		Connection conn=null;
		PreparedStatement ps= null;
		
		try
		{
			conn=DAOUtilities.getConnection();
			ps = conn.prepareStatement("insert into school values(?,?,?,?)");
			
			ps.setInt(1, school.getSchoolId());
			ps.setString(2, school.getSchoolName());
			ps.setString(3, school.getState());
			ps.setString(4, school.getCity());
			
			ps.executeUpdate();
			
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
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		}
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSchool(School school) {
		// TODO Auto-generated method stub
		
	}

}
