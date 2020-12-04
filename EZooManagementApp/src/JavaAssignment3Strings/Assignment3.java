package JavaAssignment3Strings;

public class Assignment3 {
	static String string1="abc";
	static String string2=new String("abc");
	public static void main(String[] args) {
		
		if(string1==string2)
		{
			System.out.println("string1 and string2 are equal");
		}
		else if(string1.equals(string2))
		{
			System.out.println("strin1 and 2 are equal equal");
		}
		System.out.println("string1 and string2 are not equal");
		
		
	}

}
