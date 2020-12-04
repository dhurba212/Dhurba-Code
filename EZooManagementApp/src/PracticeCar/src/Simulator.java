
public class Simulator {
	public static void main(String[] args) {
		Car newCar=new Car("Honda","Crv","White",30.5);
		newCar.Run();
		
		Wheels myWheel=new Wheels("Bridgestone", 50, 50);
		newCar.AddCarPart(myWheel);
		
		Engine myEngine=new Engine(100,2);
		newCar.AddCarPart(myEngine);
		
		try
		{
			FuelTank myFuelTank=new FuelTank(50,100,30);
			newCar.AddCarPart(myFuelTank);
		}
		catch(CustomException e) 
		{
			e.printStackTrace();
		}
		
		newCar.Run();
	}
	
	
}
