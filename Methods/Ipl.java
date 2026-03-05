class Ipl
{
	static String iplTeamNames[]={"Royal Challengers Banglore","Chennai Super Kings","Gujarat Titans","Kolkoata Night Riders","Delhi Capital","Lucknow Super Gaints","Mumbai Indians","Punjabi Kings","Rajastan Royals","Sunrises Hyderbad"};
	
	public static void main(String[] ipl)
	{
		getIplTeamNames();
	}
	
	static void getIplTeamNames()
	{
		System.out.println("List of IPL Team Names are:");
		for(String team:iplTeamNames)
			System.out.println(team);
	}
}