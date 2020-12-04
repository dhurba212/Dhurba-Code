package Assignment4ClassesThree;

public class TalkablePerson {
	public String Name;
	public int Age;
	
	public TalkablePerson(String name,int age)
	{
		this.Name=name;
		this.Age=age;
	}
	
	public void Talk() {
		System.out.println("Hello My Name Is "+ Name);
	}

}
