class MobileExecutor
{
	public static void main(String[] m)
	{
		Mobile m1=new Mobile();
		m1.brand="Samsung";
		
		Mobile m2=new Mobile();
		m2.brand="Apple";
		
		Mobile m3=new Mobile();
		m3.brand="OnePlus";
		
		Mobile m4=new Mobile();
		m4.brand="Xiaomi";
		
		Mobile m5=new Mobile();
		m5.brand="Realme";
		
		Mobile m6=new Mobile();
		m6.brand="Oppo";
		
		Mobile m7=new Mobile();
		m7.brand="Vivo";
		
		Mobile m8=new Mobile();
		m8.brand="Nokia";
		
		Mobile m9=new Mobile();
		m9.brand="Motorola";
		
		Mobile m10=new Mobile();
		m10.brand="Sony";
		
		Mobile m11=new Mobile();
		m11.brand="LG";
		
		Mobile m12=new Mobile();
		m12.brand="Asus";
		
		Mobile m13=new Mobile();
		m13.brand="Lenovo";
		
		Mobile m14=new Mobile();
		m14.brand="Google Pixel";
		
		Mobile m15=new Mobile();
		m15.brand="Huawei";
		
		Mobile mob[]=new Mobile[15];
		mob[0]=m1;
		mob[1]=m2;
		mob[2]=m3;
		mob[3]=m4;
		mob[4]=m5;
		mob[5]=m6;
		mob[6]=m7;
		mob[7]=m8;
		mob[8]=m9;
		mob[9]=m10;
		mob[10]=m11;
		mob[11]=m12;
		mob[12]=m13;
		mob[13]=m14;
		mob[14]=m15;
		
		for(Mobile mobiles:mob)
			System.out.println(mobiles.brand);
	}
}

