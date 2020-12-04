import java.util.ArrayList;
import java.util.List;

public class Car {
	private List<CarPart>carPart=new ArrayList<>();
	public String Name;
	public String Model;
	public String Color;
	public Double Milage;
	
	public Car(String name, String model,String color,Double milage) 
	{
		this.Name=name;
		this.Model=model;
		this.Color=color;
		this.Milage=milage;
	}
	public void AddCarPart(CarPart carpart)
	{
		carPart.add(carpart);
	}
	public void Run()
	{
		int i=0;
		while(i<carPart.size())
		{
			carPart.get(i).function();
			i++;
		}
			
		//System.out.println("I am a car and i run:"+this.Milage+" Miles Per hour.");
	}
}
