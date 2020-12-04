package JavaAssignment2;

public class Assignment1 {
	public static void main(String[] args) {
		
		CheckEvenOdd(2.0);
	}
	public static void CheckEvenOdd(double num) {
		
		if(num%2==0) {
			System.out.println(num+": It is a even number");
		}
		else 
		{
			System.out.println(num+": is an odd number");
		}
	}

}
