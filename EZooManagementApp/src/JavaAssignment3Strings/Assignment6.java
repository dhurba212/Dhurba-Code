package JavaAssignment3Strings;

public class Assignment6 {
	public static void main(String[] args) {
		String string1="Hello My Name is Java";
		
		int index1=string1.indexOf(" ");
		System.out.println(index1);
		int index2=string1.indexOf(" ",index1+1);
		System.out.println(index2);
	}

}
