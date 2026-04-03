class House
{
	String indoorGames[] = new String[6];
	int index;
	
	public boolean addIndoorGames(String indoorGame)
	{
		boolean isAddedIndoorGames = false;
		if(index < indoorGames.length)
		{
			if(indoorGame != null && !indoorGame.isEmpty())
			{
				indoorGames[index++] = indoorGame;
				isAddedIndoorGames = true;
			}else	
				System.out.println(indoorGame + "is not available");
		}else
			System.out.println("This Indoor Games are not playing in this House");
		return isAddedIndoorGames;	
	}
	
	public void getIndoorGames()
	{
		System.out.println("\nIndoor Games in this House are....");
		for(String games : indoorGames)
		System.out.println(games);
	}
	
}