package dao_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.FeedingSchedule;

public class FeedingScheduleImpDAO implements FeedingScheduleDAO {
	
	@Override
	public List<FeedingSchedule> getFeedingSchedule() {
		
		Connection conn=null;
		PreparedStatement ps=null;
		
		List<FeedingSchedule>feedingschedules=new ArrayList<FeedingSchedule>();
		try
		{
			conn=UtilitiesDAO.getConnection();
			String sql="Select * From feeding_schedules";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				FeedingSchedule fs=new FeedingSchedule();
				
				fs.setSchedule_id(rs.getInt("schedule_id"));//we can also use name instead of index(1) like "schedule_ID"
				fs.setFeeding_time(rs.getString(2));
				fs.setRecurrence(rs.getString(3));
				fs.setFood(rs.getString(4));
				fs.setNotes(rs.getString(5));
				
				feedingschedules.add(fs);
				
				
			}
		}catch(ClassNotFoundException | SQLException e)
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
		return feedingschedules;
	}

@Override
	public void addFeedingSchedule(FeedingSchedule feedingschedule) {
		try{
			Connection conn=UtilitiesDAO.getConnection();
			String sql="Insert Into feeding_schedules values(?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setInt(1,feedingschedule.getSchedule_id());
			ps.setString(2, feedingschedule.getFeeding_time());
			ps.setString(3, feedingschedule.getRecurrence());
			ps.setString(4, feedingschedule.getFood());
			ps.setString(5, feedingschedule.getNotes());
			
			ps.executeUpdate();
			System.out.println("Feeding Schedule added successfully");
			
			conn.close();
			
			ps.close();
			
		}catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
			System.out.println("feeding schedule wasnt added");
		}
		
	}

	@Override
	public void updateFeedingSchedule(FeedingSchedule feedingschedule) {
		// TODO Auto-generated method stub
		try 
		{
			Connection conn=UtilitiesDAO.getConnection();
			String sql= "Update feeding_schedule SET notes='updated feeding' where schedule_ID=1";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.executeUpdate();
			
			conn.close();
			ps.close();
			
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void deleteFeedingSchedule(FeedingSchedule feedingschedule) {
		// TODO Auto-generated method stub
		
	}
	
	

}
