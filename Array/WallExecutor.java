class WallExecutor
{
	public static void main(String[] w)
	{
		Wall w1=new Wall();
		w1.color="white";
		
		Wall w2=new Wall();
		w2.color="Blue";
		
		Wall w3=new Wall();
		w3.color="Green";
		
		Wall w4=new Wall();
		w4.color="yellow";
		
		Wall w5=new Wall();
		w5.color="Pink";
		
		Wall w6=new Wall();
		w6.color="Grey";
		
		Wall w7=new Wall();
		w7.color="Orange";
		
		Wall w8=new Wall();
		w8.color="Purple";
		
		Wall w9=new Wall();
		w9.color="Brown";
		
		Wall w10=new Wall();
		w10.color="Brown";
		
		Wall w11=new Wall();
		w11.color="Black";
		
		Wall w12=new Wall();
		w12.color="Cream";
		
		Wall w13=new Wall();
		w13.color="Navy Blue";
		
		Wall w14=new Wall();
		w14.color="Gold";
		
		Wall w15=new Wall();
		w15.color="Silver";
		
		
		Wall wall[]=new Wall[15];
		wall[0]=w1;
		wall[1]=w2;
		wall[2]=w3;
		wall[3]=w4;
		wall[4]=w5;
		wall[5]=w6;
		wall[6]=w7;
		wall[7]=w8;
		wall[8]=w9;
		wall[9]=w10;
		wall[10]=w11;
		wall[11]=w12;
		wall[12]=w13;
		wall[13]=w14;
		wall[14]=w15;
		
		for(Wall walls:wall)
			System.out.println(walls.color);
	}
}