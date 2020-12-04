
public class Wheels extends CarPart {
	private int Durability;
	private int levelOfWears;
	private String Name;
	boolean isPunctured = false;
	
	public Wheels(String name,int wears, int durability)
	{
		Name=name;
		levelOfWears=wears;
		Durability=durability;
		
	}
	
	public void WheelMethod()
	{
		System.out.println("Its a wheel method");
	}
	
	public void function()
	{
		System.out.println("The car has "+this.Name+ " wheels and the level of wear is: "+this.levelOfWears);
	}

}
