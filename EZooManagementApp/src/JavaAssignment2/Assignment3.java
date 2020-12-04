package JavaAssignment2;

public class Assignment3 {
	public static void main(String[] args) {
		int x=2;
		String y;
		//Ternary Operator
		y=(x>=3)? x+" is greater than or equal to 3":x+" is less than 3";
		
		System.out.println(y);
		
		//If-ELse Statement
		if(x>=3)
		{
			System.out.println(x+" is greater or equal to 3");
		}
		else
		{
			System.out.println(x+" is less than 3");
		}
	}
}
