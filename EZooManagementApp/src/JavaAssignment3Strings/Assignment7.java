package JavaAssignment3Strings;

public class Assignment7 {
	public static void main(String[] args) {
		String string1= "http://example.com?access_token=EFEc8328h29jndjd02h12$3829&ds98d";
		int index1=string1.indexOf("=");
		String token=string1.substring(index1+1);
		System.out.println(token);
	}

}
