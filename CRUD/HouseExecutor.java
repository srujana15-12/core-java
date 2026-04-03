class HouseExecutor
{
	public static void main(String[]house)
	{
		House games = new House();
		
		boolean added = games.addIndoorGames("Chess");
		System.out.println(added);
		
		added = games.addIndoorGames("Carrom");
		System.out.println(added);
		
		added = games.addIndoorGames("Ludo");
		System.out.println(added);
		
		added = games.addIndoorGames("Tennis");
		System.out.println(added);
		
		added = games.addIndoorGames("Puzzles");
		System.out.println(added);
		
		added = games.addIndoorGames("Badminton");
		System.out.println(added);
		
		games.getIndoorGames();
	}
}
	