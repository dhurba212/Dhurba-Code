
public class CarPart  implements Functional {
	
	private int Durability;
	
	public CarPart()
	{
		
	}
	
	public void SetDurability(int durability)
	{
		this.Durability=durability;
	}
	public int GetDurability()
	{
		return Durability;
	}
	
	public void Status(CarPart part)
	{
		System.out.println("The Durability of "+part.getClass()+ " is "+this.Durability);
	}
	
	public void function()
	{
		System.out.println(this.Durability);
	}
	//@Override
	//public void function() {
		// TODO Auto-generated method stub
		
	//}
	

}
