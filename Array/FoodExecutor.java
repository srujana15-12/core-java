class FoodExecutor
{
	public static void main(String[] foods)
	{
		Food f1=new Food();
		f1.name="Idli";
		f1.hotel="Vidhatri Bhavan";
		f1.place="Shivamogga";
		
		Food f2=new Food();
		f2.name="Dosa";
		
		Food f3=new Food();
		f3.name="Puri";
		
		Food f4=new Food();
		f4.name="Biryani";
		
		Food f5=new Food();
		f5.name="Chapati";
		
		Food f6=new Food();
		f6.name="Upma";
		
		Food f7=new Food();
		f7.name="Vada";
		
		Food f8=new Food();
		f8.name="Pongal";
		
		Food f9=new Food();
		f9.name="Fried Rice";
		
		Food f10=new Food();
		f10.name="Noodles";
		
		Food f11=new Food();
		f11.name="Pizza";
		
		Food f12=new Food();
		f12.name="Burger";
		
		Food f13=new Food();
		f13.name="Sandwich";
		
		Food f14=new Food();
		f14.name="Pasta";
		
		Food f15=new Food();
		f15.name="Ice Cream";
		
		Food food[]=new Food[15];
		food[0]=f1;
		food[1]=f2;
		food[2]=f3;
		food[3]=f4;
		food[4]=f5;
		food[5]=f6;
		food[6]=f7;
		food[7]=f8;
		food[8]=f9;
		food[9]=f10;
		food[10]=f11;
		food[11]=f12;
		food[12]=f13;
		food[13]=f14;
		food[14]=f15;
		
		for(Food foodie:food)
			System.out.println(foodie.name);
	}
}

