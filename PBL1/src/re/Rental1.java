package re;
import mv.*;
public class Rental1{
    private Movie1 _movie;
    private int _daysRented;
   // private double getCharge;
  public double getCharge() {
    	 double result = 0;
    		switch (getMovie().getPriceCode()){
    	    case Movie1.REGULAR:
    	       result += 2;
    	        if (getDaysRented() > 2)
    	             result += (getDaysRented() - 2) * 1.5;
    	        break;

    	case Movie1.NEW_RELEASE:
    	        result += getDaysRented() * 3;
    	        break;
    	case Movie1.CHILDRENS:
    	       result += 1.5;
    	        if(getDaysRented() > 3)
    	           result += (getDaysRented() - 3) * 1.5;
    	         break;
    	 }
    		return result;
     }
    public Rental1(Movie1 movie1, int daysRented){
     _movie = movie1;
     _daysRented = daysRented;
    }
     public int getDaysRented() {
       return _daysRented;
     }
    public Movie1 getMovie(){
       return _movie;
     }
   
}