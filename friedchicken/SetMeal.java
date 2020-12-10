package friedchicken;

public class SetMeal {

	String tcname;
	double tcprice;
	String zjname;
	Drinks smdrink;
	
	SetMeal(){		
	}
	
//	SetMeal(String tcname,double tcprice,String zjname,Drinks smdrink){
//		this.tcname=tcname;
//		this.tcprice=tcprice;
//		this.zjname=zjname;
//		this.smdrink=smdrink;
//	}
	SetMeal(String tcname,double tcprice,String zjname,Drinks smdrink){
		this.tcname=tcname;
		this.tcprice=tcprice;
		this.zjname=zjname;
		this.smdrink=smdrink;
	}
	
	public String toString(){
		System.out.println("套餐名："+tcname+" 套餐价格："+tcprice+" 炸鸡名："+zjname+" 饮料名："+smdrink.name);
		return "";
	}
	
}
