package dao_package;

import java.util.List;

import model.FeedingSchedule;

public interface FeedingScheduleDAO {
	List<FeedingSchedule>getFeedingSchedule();
	
	void addFeedingSchedule(FeedingSchedule feedingschedule);
	
	void updateFeedingSchedule(FeedingSchedule feedingschedule);
	
	void deleteFeedingSchedule(FeedingSchedule feedingschedule);

}
