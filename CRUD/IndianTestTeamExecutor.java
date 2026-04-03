class IndianTestTeamExecutor
{
	public static void main(String[]exe)
	{
		IndianTestTeam players = new IndianTestTeam();
		
		boolean added = players.addPlayersNames("Shubman Gill");
		System.out.println(added);
		
		added = players.addPlayersNames("Rishab Pant");
		System.out.println(added);
		
		added = players.addPlayersNames("Yashasvi Jaiswal");
		System.out.println(added);
		
		added = players.addPlayersNames("KL Rahul");
		System.out.println(added);
		
		added = players.addPlayersNames("Sai Sudharsan");
		System.out.println(added);
		
		added = players.addPlayersNames("Karun Nair");
		System.out.println(added);
		
		added = players.addPlayersNames("Ravindra Jadeja");
		System.out.println(added);
		
		added = players.addPlayersNames("Washington Sundar");
		System.out.println(added);
		
		added = players.addPlayersNames("Jasprit Bumrah");
		System.out.println(added);
		
		added = players.addPlayersNames("Mohammed Siraj");
		System.out.println(added);
		
		added = players.addPlayersNames("Akash Deep");
		System.out.println(added);
			
		players.getPlayersNames();
	}
}