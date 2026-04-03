class IndianTestTeam
{
	String PlayersNames[] = new String[11];
	int index;
	
	public boolean addPlayersNames(String playersName)
	{
	boolean isAddedPlayersNames = false;
	if(playersName != null && !playersName.isEmpty()){
		PlayersNames[index++] = playersName;
		isAddedPlayersNames = true;
	}else
		System.out.println(playersName +"is not valid");
	return isAddedPlayersNames;
	}
	
	public void getPlayersNames()
	{
		System.out.println("\nIndian Test Team Players Names are...");
		for(String names : PlayersNames)
		System.out.println(names);
	}
}