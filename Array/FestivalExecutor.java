class FestivalExecutor
{
	public static void main(String[] festivals)
	{
		Festival f1=new Festival();
		f1.name="Diwali";
		
		Festival f2=new Festival();
		f2.name="Holi";
		
		Festival f3=new Festival();
		f3.name="Dussehra";
		
		Festival f4=new Festival();
		f4.name="Ugadi";
		
		Festival f5=new Festival();
		f5.name="Pongal";
		
		Festival f6=new Festival();
		f6.name="Onam";
		
		Festival f7=new Festival();
		f7.name="Eid";
		
		Festival f8=new Festival();
		f8.name="Christmas";
		
		Festival f9=new Festival();
		f9.name="Raksha Bandhan";
		
		Festival f10=new Festival();
		f10.name="Ganesh Chaturthi";
		
		Festival f11=new Festival();
		f11.name="Navratri";
		
		Festival f12=new Festival();
		f12.name="Janmashtami";
		
		Festival f13=new Festival();
		f13.name="Makar Sankranti";
		
		Festival f14=new Festival();
		f14.name="Baisakhi";
		
		Festival f15=new Festival();
		f15.name="Karwa Chauth";
		
		Festival festival[]=new Festival[15];
		festival[0]=f1;
		festival[1]=f2;
		festival[2]=f3;
		festival[3]=f4;
		festival[4]=f5;
		festival[5]=f6;
		festival[6]=f7;
		festival[7]=f8;
		festival[8]=f9;
		festival[9]=f10;
		festival[10]=f11;
		festival[11]=f12;
		festival[12]=f13;
		festival[13]=f14;
		festival[14]=f15;
		
		for(Festival festive:festival)
			System.out.println(festive.name);
	}
}

