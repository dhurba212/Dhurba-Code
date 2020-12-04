package DemoForStatic;

public class Main {
	
	public static void main(String[] args) {
		Demo1 demo1=new Demo1();
		//demo1.staticNumber=20;
		//demo1.regularNumber=20;
		
		System.out.println(demo1.staticNumber);
		System.out.println(demo1.regularNumber);
		
		Demo2 demo2=new Demo2();
		int staticNumberd2=demo2.staticNumber;
		int regularNumberd2=demo2.regularNumber;
		
		System.out.println(staticNumberd2);
		System.out.println(regularNumberd2);
	}

}
