class CollegeExecutor
{
	public static void main(String[] col)
	{
		College c1=new College();
		c1.name="JNNCE";
		
		College c2=new College();
		c2.name="SRNMNC";
		
		College c3=new College();
		c3.name="BITS";
		
		College c4=new College();
		c4.name="VIT";
		
		College c5=new College();
		c5.name="SRM";
		
		College c6=new College();
		c6.name="PES";
		
		College c7=new College();
		c7.name="RVCE";
		
		College c8=new College();
		c8.name="MSRIT";
		
		College c9=new College();
		c9.name="BMSCE";
		
		College c10=new College();
		c10.name="JSS";
		
		College c11=new College();
		c11.name="Christ";
		
		College c12=new College();
		c12.name="Jain";
		
		College c13=new College();
		c13.name="Amity";
		
		College c14=new College();
		c14.name="Manipal";
		
		College c15=new College();
		c15.name="Alliance";
		
		College college[]=new College[15];
		college[0]=c1;
		college[1]=c2;
		college[2]=c3;
		college[3]=c4;
		college[4]=c5;
		college[5]=c6;
		college[6]=c7;
		college[7]=c8;
		college[8]=c9;
		college[9]=c10;
		college[10]=c11;
		college[11]=c12;
		college[12]=c13;
		college[13]=c14;
		college[14]=c15;
		
		for(College colleges:college)
			System.out.println(colleges.name);
	}
}

