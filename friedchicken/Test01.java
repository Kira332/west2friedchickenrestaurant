package friedchicken;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args) {
		LocalDate ajmanufacture=LocalDate.of(2020,12,2);		
		LocalDate abmanufacture=LocalDate.of(2020,12,1);
		Drinks appleJuice=new Juice("ƻ��֭",10.0, ajmanufacture);
		Drinks appleBeer=new Beer("ƻ����",20.0, abmanufacture,15);
		West2FriedChickenResturan restaurant=new West2FriedChickenResturan(60.0);
		restaurant.purchase(appleBeer, 1);
		restaurant.purchase(appleJuice, 5);
		restaurant.sm1.toString();
		restaurant.sm2.toString();
		restaurant.sell(restaurant.sm1);//���۳�ʼ���ײ�		
		restaurant.sell(restaurant.sm2);

	}
}
