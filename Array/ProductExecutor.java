class ProductExecutor
{
	public static void main(String[] prod)
	{
		Product p1=new Product();
		p1.name="Rice";
		
		Product p2=new Product();
		p2.name="Oil";
		
		Product p3=new Product();
		p3.name="Milk";
		
		Product p4=new Product();
		p4.name="Sugar";
		
		Product p5=new Product();
		p5.name="Salt";
		
		Product p6=new Product();
		p6.name="Wheat";
		
		Product p7=new Product();
		p7.name="Flour";
		
		Product p8=new Product();
		p8.name="Soap";
		
		Product p9=new Product();
		p9.name="Shampoo";
		
		Product p10=new Product();
		p10.name="Biscuits";
		
		Product p11=new Product();
		p11.name="Chocolates";
		
		Product p12=new Product();
		p12.name="Tea Powder";
		
		Product p13=new Product();
		p13.name="Coffee Powder";
		
		Product p14=new Product();
		p14.name="Detergent";
		
		Product p15=new Product();
		p15.name="Toothpaste";
		
		Product product[]=new Product[15];
		product[0]=p1;
		product[1]=p2;
		product[2]=p3;
		product[3]=p4;
		product[4]=p5;
		product[5]=p6;
		product[6]=p7;
		product[7]=p8;
		product[8]=p9;
		product[9]=p10;
		product[10]=p11;
		product[11]=p12;
		product[12]=p13;
		product[13]=p14;
		product[14]=p15;
		
		for(Product p:product)
			System.out.println(p.name);
	}
}

