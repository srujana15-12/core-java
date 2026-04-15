class FruitsExecutor
{
	public static void main(String[] f)
	{
		Fruit f1=new Fruit();
		f1.name="Apple";
		
		Fruit f2=new Fruit();
		f2.name="Banana";
		
		Fruit f3=new Fruit();
		f3.name="Mango";
		
		Fruit f4=new Fruit();
		f4.name="Orange";
		
		Fruit f5=new Fruit();
		f5.name="Grapes";
		
		Fruit f6=new Fruit();
		f6.name="Pineapple";
		
		Fruit f7=new Fruit();
		f7.name="Strawberry";
		
		Fruit f8=new Fruit();
		f8.name="Watermelon";
		
		Fruit f9=new Fruit();
		f9.name="Papaya";
		
		Fruit f10=new Fruit();
		f10.name="Guava";
		
		Fruit f11=new Fruit();
		f11.name="Kiwi";
		
		Fruit f12=new Fruit();
		f12.name="Pomegranate";
		
		Fruit f13=new Fruit();
		f13.name="Cherry";
		
		Fruit f14=new Fruit();
		f14.name="Peach";
		
		Fruit f15=new Fruit();
		f15.name="Pear";
		
		Fruit fruits[]=new Fruit[15];
		fruits[0]=f1;
		fruits[1]=f2;
		fruits[2]=f3;
		fruits[3]=f4;
		fruits[4]=f5;
		fruits[5]=f6;
		fruits[6]=f7;
		fruits[7]=f8;
		fruits[8]=f9;
		fruits[9]=f10;
		fruits[10]=f11;
		fruits[11]=f12;
		fruits[12]=f13;
		fruits[13]=f14;
		fruits[14]=f15;
		
		for(Fruit fruit:fruits)
			System.out.println(fruit.name);
	}
}

