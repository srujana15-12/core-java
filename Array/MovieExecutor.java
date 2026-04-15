class MovieExecutor
{
	public static void main(String[] m)
	{
		Movie m1=new Movie();
		m1.name="RRR";
		
		Movie m2=new Movie();
		m2.name="KGF";
		
		Movie m3=new Movie();
		m3.name="Bahubali";
		
		Movie m4=new Movie();
		m4.name="Pushpa";
		
		Movie m5=new Movie();
		m5.name="Salaar";
		
		Movie m6=new Movie();
		m6.name="Leo";
		
		Movie m7=new Movie();
		m7.name="Jailer";
		
		Movie m8=new Movie();
		m8.name="Vikram";
		
		Movie m9=new Movie();
		m9.name="Master";
		
		Movie m10=new Movie();
		m10.name="War";
		
		Movie m11=new Movie();
		m11.name="Pathaan";
		
		Movie m12=new Movie();
		m12.name="Dangal";
		
		Movie m13=new Movie();
		m13.name="Drishyam";
		
		Movie m14=new Movie();
		m14.name="Kantara";
		
		Movie m15=new Movie();
		m15.name="Animal";
		
		Movie movie[]=new Movie[15];
		movie[0]=m1;
		movie[1]=m2;
		movie[2]=m3;
		movie[3]=m4;
		movie[4]=m5;
		movie[5]=m6;
		movie[6]=m7;
		movie[7]=m8;
		movie[8]=m9;
		movie[9]=m10;
		movie[10]=m11;
		movie[11]=m12;
		movie[12]=m13;
		movie[13]=m14;
		movie[14]=m15;
		
		for(Movie mov:movie)
			System.out.println(mov.name);
	}
}

