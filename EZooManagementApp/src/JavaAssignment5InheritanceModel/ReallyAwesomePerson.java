package JavaAssignment5InheritanceModel;

public class ReallyAwesomePerson extends AwesomePerson
{
	
	public ReallyAwesomePerson()
	
	{
		super();
		System.out.println("I am a reallyAwesomePerson "+Name);
	}
	public void Talk(String loud)
	{
		System.out.println("ReallyAwesoePerson Talks"+loud);
	}
}
