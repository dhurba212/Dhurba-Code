package JavaAssignment3Strings;

public class Assignment13 {
	public static void main(String[] args) {
		String string1="angleee54";
		String string2="4gleanee5";
		int a=0;
		
		if(string1.length()==string2.length()) 
		{
			for(int i=0;i<string1.length();i++)
			{
				for(int j=0;j<string2.length();j++)
				{
					if(string1.charAt(i)==string2.charAt(j) )
					{
						string2=string2.substring(0,j)+string2.substring(j+1);
					}
					
				}
			}
		}
		
		
		if(string2.length()!=0)
		{
			System.out.println("string1 and string2 are not anagram");
		}
		else
		{
			System.out.println("string1 and string2 are anagram");
		}
		System.out.println(a);
		
		
	}

}
