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
		System.out.println("�ײ�����"+tcname+" �ײͼ۸�"+tcprice+" ը������"+zjname+" ��������"+smdrink.name);
		return "";
	}
	
}
