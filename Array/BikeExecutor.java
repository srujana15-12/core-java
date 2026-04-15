class BikeExecutor
{
	public static void main(String[] b)
	{
		Bike b1=new Bike();
		b1.brand="Yamaha";
		
		Bike b2=new Bike();
		b2.brand="Honda";
		
		Bike b3=new Bike();
		b3.brand="Suzuki";
		
		Bike b4=new Bike();
		b4.brand="KTM";
		
		Bike b5=new Bike();
		b5.brand="Royal Enfield";
		
		Bike b6=new Bike();
		b6.brand="Bajaj";
		
		Bike b7=new Bike();
		b7.brand="TVS";
		
		Bike b8=new Bike();
		b8.brand="Hero";
		
		Bike b9=new Bike();
		b9.brand="Harley Davidson";
		
		Bike b10=new Bike();
		b10.brand="Ducati";
		
		Bike b11=new Bike();
		b11.brand="Kawasaki";
		
		Bike b12=new Bike();
		b12.brand="Triumph";
		
		Bike b13=new Bike();
		b13.brand="Benelli";
		
		Bike b14=new Bike();
		b14.brand="Aprilia";
		
		Bike b15=new Bike();
		b15.brand="BMW";
		
		Bike bike[]=new Bike[15];
		bike[0]=b1;
		bike[1]=b2;
		bike[2]=b3;
		bike[3]=b4;
		bike[4]=b5;
		bike[5]=b6;
		bike[6]=b7;
		bike[7]=b8;
		bike[8]=b9;
		bike[9]=b10;
		bike[10]=b11;
		bike[11]=b12;
		bike[12]=b13;
		bike[13]=b14;
		bike[14]=b15;
		
		for(Bike bikes:bike)
			System.out.println(bikes.brand);
	}
}

