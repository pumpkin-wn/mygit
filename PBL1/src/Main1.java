import cu.*;
import mv.*;
import re.*;

public class Main1{
	public static void main(String[] args) {
		/*Movie m1=new Movie("Jack",2);
		Movie m1=new Movie("Jack",2);
		Movie m1=new Movie("Jack",2);
		*/
		Customer1 c1=new Customer1("LiMING");
		c1.addRental(new Rental1(new Movie1("jack",2),6));
		System.out.print(c1.statement());
	}
}