package Assignment4ClassesTwo;

public class PrivatePerson {
	
	private String Name;
	private int Age;
	
	public PrivatePerson(String name,int age)
	{
		this.Name=name;
		this.Age=age;
				
	}
	
	public String GetName()
	{
		return this.Name;
	}
	public void SetName(String name)
	{
			this.Name=name;
	}

	public int GetAge() {
		return this.Age;
	}
	public void SetAge(int age)
	{
		if(age<=0)
		{
			System.out.println("Age cannot be set to 0 or less");
		}
		this.Age=age;
	}

}
