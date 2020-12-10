package friedchicken;

import java.time.LocalDate;

public class Juice extends Drinks{
	int expirydate=2;
	
	Juice(){		
	}
	
	Juice(String name, double cost, LocalDate manufacture) {
		this.name=name;
		this.cost=cost;
		this.manufacture=manufacture;
	}

	public  String toString() {
		System.out.println("name:"+this.name+" cost:"+this.cost);
		return this.name;	
	}
	
}
