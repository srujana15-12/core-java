class CountryExecutor
{
	public static void main(String[] coun)
	{
		Country c1=new Country();
		c1.name="India";
		
		Country c2=new Country();
		c2.name="USA";
		
		Country c3=new Country();
		c3.name="Canada";
		
		Country c4=new Country();
		c4.name="Australia";
		
		Country c5=new Country();
		c5.name="UK";
		
		Country c6=new Country();
		c6.name="Germany";
		
		Country c7=new Country();
		c7.name="France";
		
		Country c8=new Country();
		c8.name="Japan";
		
		Country c9=new Country();
		c9.name="China";
		
		Country c10=new Country();
		c10.name="Brazil";
		
		Country c11=new Country();
		c11.name="Italy";
		
		Country c12=new Country();
		c12.name="Spain";
		
		Country c13=new Country();
		c13.name="Russia";
		
		Country c14=new Country();
		c14.name="South Korea";
		
		Country c15=new Country();
		c15.name="South Africa";
		
		Country count[]=new Country[15];
		count[0]=c1;
		count[1]=c2;
		count[2]=c3;
		count[3]=c4;
		count[4]=c5;
		count[5]=c6;
		count[6]=c7;
		count[7]=c8;
		count[8]=c9;
		count[9]=c10;
		count[10]=c11;
		count[11]=c12;
		count[12]=c13;
		count[13]=c14;
		count[14]=c15;
		
		for(Country countries:count)
			System.out.println(countries.name);
	}
}

