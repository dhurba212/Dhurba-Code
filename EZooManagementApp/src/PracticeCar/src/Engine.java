
public class Engine extends CarPart{
	private int Durability;
	private boolean isRunning=true;
	private int numOfCylinder;
	
	public Engine(int durability,int cylinder)
	{
		this.Durability=durability;
		this.numOfCylinder=cylinder;
	}
	
	public boolean GetIsRunning()
	{
		return this.isRunning;
	}
	
	public void SetEngineIsRunning(boolean isrunning)
	{
		this.isRunning=isrunning;
	}
	
	public void EngineMethod()
	{
		System.out.println("this is a method from engine");
	}
	
	public void function()
	{
		System.out.println("The engine has "+this.numOfCylinder+" cylinders and its working "+this.isRunning);
	}

}
