package cu;
import re.*;
import java.util.*;
import mv.*;

public class Customer {
      private String _name;
      private Vector _rentals = new Vector() ;

      public Customer (String name){
        _name = name;
      };

      public void addRental(Rental arg){
        _rentals.addElement(arg);
      }

      public String getName(){
      return _name;
       };
       public String statement() {
    	    double totalAmount = 0;
    	    int frequentRenterPoints = 0;
    	    Enumeration rentals = _rentals.elements();
    	    String result = "Rental Recurd for "+ getName() + "\n";
    	    while(rentals.hasMoreElements()) {
    	    Rental each = (Rental) rentals.nextElement();
    	   // frequentRenterPoints+=each.getFrequentRenterPoints();
    	  //add frequent renter points
    	    frequentRenterPoints++;
    	    if((each.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&each.getDaysRented()>1)
    	    frequentRenterPoints++;
    	   //show figures for this rental
    	         result += "\t" + each.getMovie().getTitle() + "\t" + String .valueOf(each. getCharge()) + "\n";
    	     }

    	   // add footer lines
    	    result += "Amount owed is "+ String.valueOf (totalAmount) + "\n";
    	    result += "You earned " + String.valueOf (frequentRenterPoints)+" frequent renter points";
    	    return result;
    	}
       private double getTotalCharge(){
    	   double result=0;
    	   Enumeration rentals=_rentals.elements();
    	   while(rentals.hasMoreElements()){
    		   Rental each=(Rental)rentals.nextElement();
    		   result+=each.getCharge();
    	   }
    	   return result;
       }
 private double amountFor(Rental aRental) {
	return aRental.getCharge(); 
 }
}

