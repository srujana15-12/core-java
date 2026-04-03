class Olympic
{
	String SportsNames[] = new String[11];
	int index;
	
	public boolean addSportsNames(String sportsName)
	{
	boolean isAddedSportsNames = false;
	if(sportsName != null && !sportsName.isEmpty()){
		SportsNames[index++] = sportsName;
		isAddedSportsNames = true;
	}else
		System.out.println(sportsName +"is not valid");
	return isAddedSportsNames;
	}
	
	public void getSportsNames()
	{
		System.out.println("\nSports are registered in Olympic are...");
		for(String names : SportsNames)
		System.out.println(names);
	}
}