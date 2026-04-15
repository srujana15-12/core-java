class HospitalExecutor
{
	public static void main(String[] h)
	{
		Hospital h1=new Hospital();
		h1.name="Apollo";
		
		Hospital h2=new Hospital();
		h2.name="Fortis";
		
		Hospital h3=new Hospital();
		h3.name="Manipal";
		
		Hospital h4=new Hospital();
		h4.name="Columbia Asia";
		
		Hospital h5=new Hospital();
		h5.name="Narayana Health";
		
		Hospital h6=new Hospital();
		h6.name="Sparsh";
		
		Hospital h7=new Hospital();
		h7.name="Rainbow";
		
		Hospital h8=new Hospital();
		h8.name="Aster";
		
		Hospital h9=new Hospital();
		h9.name="Global Hospital";
		
		Hospital h10=new Hospital();
		h10.name="Care Hospital";
		
		Hospital h11=new Hospital();
		h11.name="Medanta";
		
		Hospital h12=new Hospital();
		h12.name="KIMS";
		
		Hospital h13=new Hospital();
		h13.name="Sunshine";
		
		Hospital h14=new Hospital();
		h14.name="Yashoda";
		
		Hospital h15=new Hospital();
		h15.name="Max Healthcare";
		
		Hospital hos[]=new Hospital[15];
		hos[0]=h1;
		hos[1]=h2;
		hos[2]=h3;
		hos[3]=h4;
		hos[4]=h5;
		hos[5]=h6;
		hos[6]=h7;
		hos[7]=h8;
		hos[8]=h9;
		hos[9]=h10;
		hos[10]=h11;
		hos[11]=h12;
		hos[12]=h13;
		hos[13]=h14;
		hos[14]=h15;
		
		for(Hospital hospitals:hos)
			System.out.println(hospitals.name);
	}
}

