package JavaAssignment3Strings;

public class Assignment2 {
	public static void main(String[] args) {
		
		String string1="abc";
		String string2="ABC";
		String string3=string1.toUpperCase();
		
		if(string3==string2)
		{
			System.out.println("String1 and String2 are equal");
		}
		else
		{
			System.out.println("String1 and String2 are not equal");
		}
		
		if(string1.equalsIgnoreCase(string2))
		{
			System.out.println("String1 and String2 are equal");
		}
		else
		{
			System.out.println("String1 and String2 are not equal");
		}
		
	}
}
