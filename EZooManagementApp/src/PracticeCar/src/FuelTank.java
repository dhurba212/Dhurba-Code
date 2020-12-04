import java.lang.Exception;
public class FuelTank extends CarPart {
	private int Durability;
	private int fuelLevel=0;
	private int holdGallons;
	
	public FuelTank(int durability,int fuellevel,int holdgallons)throws CustomException
	{
		if(holdgallons<0 || holdgallons>50)
		{
			throw new CustomException("Gallons cant be negative or greater than 50.");
		}
		else {this.holdGallons=holdgallons;}
		
		this.Durability=durability;
		this.fuelLevel=fuellevel;
	}
	public void SetFuelLevel(int level) throws CustomException
	{
		if(level<0 || level>100) 
		{
			throw new CustomException("Level cannot be less than zero or more than 100");
		}
		this.fuelLevel=level;
	}
	public int GetFuelLevel()
	{
		return fuelLevel;
	}
	
	public void FuelTankStatus()
	{
		System.out.println("Fuel tank can hold "+this.holdGallons+" Gallons of fuel.");
	}
	
	public void function()
	{
		System.out.println("The fuelLevel of this fuel tank is: "+this.fuelLevel+" and it can hold "+this.holdGallons+" Gallons of fuel");
	}
}
