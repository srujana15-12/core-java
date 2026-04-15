class CompanyExecutor
{
	public static void main(String[] comp)
	{
		Company c1=new Company();
		c1.name="TCS";
		
		Company c2=new Company();
		c2.name="Infosys";
		
		Company c3=new Company();
		c3.name="Wipro";
		
		Company c4=new Company();
		c4.name="HCL";
		
		Company c5=new Company();
		c5.name="Tech Mahindra";
		
		Company c6=new Company();
		c6.name="Accenture";
		
		Company c7=new Company();
		c7.name="Capgemini";
		
		Company c8=new Company();
		c8.name="IBM";
		
		Company c9=new Company();
		c9.name="Oracle";
		
		Company c10=new Company();
		c10.name="Microsoft";
		
		Company c11=new Company();
		c11.name="Google";
		
		Company c12=new Company();
		c12.name="Amazon";
		
		Company c13=new Company();
		c13.name="Flipkart";
		
		Company c14=new Company();
		c14.name="Zoho";
		
		Company c15=new Company();
		c15.name="Paytm";
		
		Company company[]=new Company[15];
		company[0]=c1;
		company[1]=c2;
		company[2]=c3;
		company[3]=c4;
		company[4]=c5;
		company[5]=c6;
		company[6]=c7;
		company[7]=c8;
		company[8]=c9;
		company[9]=c10;
		company[10]=c11;
		company[11]=c12;
		company[12]=c13;
		company[13]=c14;
		company[14]=c15;
		
		for(Company companies:company)
			System.out.println(companies.name);
	}
}

