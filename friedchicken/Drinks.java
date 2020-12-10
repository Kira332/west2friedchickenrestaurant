package friedchicken;

import java.time.LocalDate;

public abstract class Drinks {
	  
      protected String name;
      protected double cost;
      protected LocalDate manufacture;
	  protected int expirydate;	  	  
	  
	  Drinks(){		    
	  }
	  
	  Drinks(String name,double cost,LocalDate manufacture,int expirydate){
		  this.name=name;
		  this.cost=cost;
		  this.manufacture=manufacture;
		  this.expirydate=expirydate;
	  }
	  
	  public abstract String toString();
	  
	  public boolean exceedtimelimit() {
		  if(this instanceof Juice) {
			  	Juice juice = (Juice) this;			   
			  	if(manufacture.plusDays(juice.expirydate).isAfter(LocalDate.now())) {
			  		return false;
			  	}else {
			  		return true;
			  	}
		  }
		  else 
		  {		Beer beer = (Beer) this;
			  	if(manufacture.plusDays(beer.expirydate).isAfter(LocalDate.now())) {
				  	return false;
			  	}else {
			  		return true;
			  	}
		  }
	  }
}
