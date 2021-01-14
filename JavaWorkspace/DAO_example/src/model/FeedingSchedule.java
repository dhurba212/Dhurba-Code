package model;

public class FeedingSchedule {
	private int schedule_id;
	private String feeding_time;
	private String recurrence;
	private String food;
	private String notes;
	
	public FeedingSchedule() {};
	
	public FeedingSchedule(int scheduleid,String feedingtime,
			String recurrence,String food,String notes
			)
	{
		this.schedule_id=scheduleid;
		this.feeding_time=feedingtime;
		this.recurrence=recurrence;
		this.food=food;
		this.notes=notes;
	}
	public int getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}
	public String getFeeding_time() {
		return feeding_time;
	}
	public void setFeeding_time(String feeding_time) {
		this.feeding_time = feeding_time;
	}
	public String getRecurrence() {
		return recurrence;
	}
	public void setRecurrence(String recurrence) {
		this.recurrence = recurrence;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
