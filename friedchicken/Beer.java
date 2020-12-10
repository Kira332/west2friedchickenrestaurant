package friedchicken;

import java.time.LocalDate;

public class Beer extends Drinks{
	int expirydate=30;
	float alcohol;
	
	public Beer() {}
	public Beer(String name, double cost, LocalDate manufacture,float alcohol) {
		this.name=name;
		this.cost=cost;
		this.manufacture=manufacture;
		this.alcohol=alcohol;
	}			
	public String toString() {
		System.out.println("name:"+name+" cost:"+cost+" alcohol:"+alcohol);
		return this.name;
	}

}
