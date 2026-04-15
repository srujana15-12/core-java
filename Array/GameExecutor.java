class GameExecutor
{
	public static void main(String[] g)
	{
		Game g1=new Game();
		g1.name="Cricket";
		
		Game g2=new Game();
		g2.name="Football";
		
		Game g3=new Game();
		g3.name="Hockey";
		
		Game g4=new Game();
		g4.name="Tennis";
		
		Game g5=new Game();
		g5.name="Badminton";
		
		Game g6=new Game();
		g6.name="Basketball";
		
		Game g7=new Game();
		g7.name="Volleyball";
		
		Game g8=new Game();
		g8.name="Baseball";
		
		Game g9=new Game();
		g9.name="Kabaddi";
		
		Game g10=new Game();
		g10.name="Chess";
		
		Game g11=new Game();
		g11.name="Carrom";
		
		Game g12=new Game();
		g12.name="Table Tennis";
		
		Game g13=new Game();
		g13.name="Rugby";
		
		Game g14=new Game();
		g14.name="Golf";
		
		Game g15=new Game();
		g15.name="Boxing";
		
		Game game[]=new Game[15];
		game[0]=g1;
		game[1]=g2;
		game[2]=g3;
		game[3]=g4;
		game[4]=g5;
		game[5]=g6;
		game[6]=g7;
		game[7]=g8;
		game[8]=g9;
		game[9]=g10;
		game[10]=g11;
		game[11]=g12;
		game[12]=g13;
		game[13]=g14;
		game[14]=g15;
		
		for(Game games:game)
			System.out.println(games.name);
	}
}

