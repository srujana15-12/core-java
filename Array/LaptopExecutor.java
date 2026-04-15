class LaptopExecutor
{
	public static void main(String[] laptops)
	{
		Laptop l1=new Laptop();
		l1.brand="Infinix";
		
		Laptop l2=new Laptop();
		l2.brand="HP";
		
		Laptop l3=new Laptop();
		l3.brand="Lenovo";
		
		Laptop l4=new Laptop();
		l4.brand="Asus";
		
		Laptop l5=new Laptop();
		l5.brand="Acer";
		
		Laptop l6=new Laptop();
		l6.brand="Apple";
		
		Laptop l7=new Laptop();
		l7.brand="Dell";
		
		Laptop l8=new Laptop();
		l8.brand="Samsung";
		
		Laptop l9=new Laptop();
		l9.brand="LG";
		
		Laptop l10=new Laptop();
		l10.brand="Sony";
		
		Laptop l11=new Laptop();
		l11.brand="Microsoft";
		
		Laptop l12=new Laptop();
		l12.brand="Razer";
		
		Laptop l13=new Laptop();
		l13.brand="Huawei";
		
		Laptop l14=new Laptop();
		l14.brand="Toshiba";
		
		Laptop l15=new Laptop();
		l15.brand="Google";
		
		Laptop laptopsArr[]=new Laptop[15];
		laptopsArr[0]=l1;
		laptopsArr[1]=l2;
		laptopsArr[2]=l3;
		laptopsArr[3]=l4;
		laptopsArr[4]=l5;
		laptopsArr[5]=l6;
		laptopsArr[6]=l7;
		laptopsArr[7]=l8;
		laptopsArr[8]=l9;
		laptopsArr[9]=l10;
		laptopsArr[10]=l11;
		laptopsArr[11]=l12;
		laptopsArr[12]=l13;
		laptopsArr[13]=l14;
		laptopsArr[14]=l15;
		
		for(Laptop laptop:laptopsArr)
			System.out.println(laptop.brand);
	}
}

