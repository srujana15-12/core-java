class SouthIndia
{
	String AirportNames[] = new String[9];
	int index;
	
	public boolean addAirportNames(String airportName)
	{
	boolean isAddedAirportNames = false;
	if(airportName != null && !airportName.isEmpty()){
		AirportNames[index++] = airportName;
		isAddedAirportNames = true;
	}else
		System.out.println(airportName +"is not valid");
	return isAddedAirportNames;
	}
	
	public void getAirportNames()
	{
		System.out.println("\nSouth Indian International Airports are...");
		for(String names : AirportNames)
		System.out.println(names);
	}
}