package JavaAssignment5InheritanceMain;

import JavaAssignment5InheritanceModel.AwesomePerson;
import JavaAssignment5InheritanceModel.ReallyAwesomePerson;

public class Application {
	public static void main(String[] args) {
		AwesomePerson awPerson=new AwesomePerson();
		awPerson.Talk();
		
		ReallyAwesomePerson rawPerson=new ReallyAwesomePerson();
		rawPerson.Talk();
		rawPerson.Talk(" shout");
	}

}
