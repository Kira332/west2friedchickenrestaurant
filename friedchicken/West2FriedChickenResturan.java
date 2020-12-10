package friedchicken;

import java.time.LocalDate;
import java.util.ArrayList;

public class West2FriedChickenResturan implements FriedChickenRestaurant{
	
	double resturantbalance;
	ArrayList<Beer> beerlist = new ArrayList<Beer>();
	ArrayList<Juice> juicelist = new ArrayList<Juice>();
	static ArrayList<SetMeal> setmeallist = new ArrayList<SetMeal>();
	static final public SetMeal sm1;
	static final public SetMeal sm2;
	
	West2FriedChickenResturan(double resturanbalance){
		this.resturantbalance=resturanbalance;
	}
	
	{
		System.out.println("----��ӭ��������ը����----");
	}
	
	//���ײ��б��ʼ��������
	static{
		
		LocalDate ajmanufacture=LocalDate.of(2020,11,24);
		Drinks appleJuice=new Juice("ƻ��֭",10.0,ajmanufacture);
		sm1=new SetMeal("�ײ�1",80.0,"ˮ��ը��",appleJuice);
		
		Drinks appleBeer=new Beer("ƻ����",10.0,ajmanufacture,1.0f);
		sm2=new SetMeal("�ײ�2",80.0,"���ּ�",appleBeer);
		
		setmeallist.add(sm1);
		setmeallist.add(sm2);
		
	}
	
	//�����ײ�
	 public void sell(SetMeal setmeal) {

		 resturantbalance+=setmeal.tcprice;
		 if (setmeal.smdrink instanceof Beer) {
			 try{
				 use((Beer)setmeal.smdrink);
				 System.out.print("�ѳ���---");
				 setmeal.toString();
			 }catch(IngredientSortOutException e) {
				 resturantbalance-=setmeal.tcprice;
				 System.out.print("+++++"+e.getMessage()+",");
					System.out.println("�޷�����"+setmeal.tcname+"+++++");
					e.printStackTrace();
			 }
		 }else if(setmeal.smdrink instanceof Juice) {
			 try{
				 use((Juice)setmeal.smdrink);
				 System.out.print("�ѳ���---");
				 setmeal.toString();
			 }catch(IngredientSortOutException e) {
				 resturantbalance-=setmeal.tcprice;
				 System.out.print("+++++"+e.getMessage()+",");
					System.out.println("�޷�����"+setmeal.tcname+"+++++");
					e.printStackTrace();
			 }
		 }
		 
		 
	 }
	 
	 
	 //��������
   public void purchase(Drinks drinks,int num) throws OverdraftBalanceException {
	   try {
	   if(drinks instanceof Beer) {
		   Beer beer = (Beer) drinks;		   
		   if(resturantbalance-beer.cost*num>=0) {
			   resturantbalance-=beer.cost*num;
			   for(int i = 0;i<num;i++) {
				   beerlist.add(beer);
			   }
			   System.out.println("%�ɹ�����"+num+"ƿ"+beer.name+"%");
		   }else throw new OverdraftBalanceException("���㣬����"+(beer.cost*num-resturantbalance)+"Ԫ��"+"�޷�����"+beer.name);
		  
	   }
	   if(drinks instanceof Juice) {
		   Juice juice = (Juice) drinks;
		   if(resturantbalance-juice.cost*num>=0) {
			   resturantbalance-=juice.cost*num;
			   for(int i = 0;i<num;i++) {
				   juicelist.add(juice);
			   }
			   System.out.println("%�ɹ�����"+num+"ƿ"+juice.name+"%");
		   }else throw new OverdraftBalanceException("���㣬����"+(juice.cost*num-resturantbalance)+"Ԫ"+"�޷�����"+juice.name);		   
	   }
	   }catch(OverdraftBalanceException e) {		   
		   e.printStackTrace();
	   }
   }
	
    //use����1
	private void use(Beer beer1) throws IngredientSortOutException{
			
			for(int i = 0;i<beerlist.size();i++) {
				if (beerlist.get(i).exceedtimelimit()) {
					beerlist.remove(i--);
				}	
			}
			boolean sign = false;
			for(Beer beer:beerlist){
				if (beer.name==beer1.name) {
					juicelist.remove(beer);
					sign = true;
					break;
				}
			}	
			if(!sign) {
				throw new IngredientSortOutException(beer1.name+"���ۿ�");
			}
		
	}
	
	//use����2
	private void use(Juice juice1) throws IngredientSortOutException{
	
			for(int i = 0;i<juicelist.size();i++) {
				if (juicelist.get(i).exceedtimelimit()) {
					juicelist.remove(i--);
				}	
			}
			boolean sign = false;
			for(Juice juice:juicelist){
				if (juice.name==juice1.name) {
					juicelist.remove(juice);
					sign = true;
					break;
				}
			}	
			if(!sign) {
				throw new IngredientSortOutException(juice1.name+"���ۿ�");
			}
		
	}

}
