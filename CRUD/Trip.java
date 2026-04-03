class Trip
{
	String Places[] = new String[13];
	int index;
	
	public boolean addPlaces(String place)
	{
	boolean isAddedPlaces = false;
	if(place != null && !place.isEmpty()){
		Places[index++] = place;
		isAddedPlaces = true;
	}else
		System.out.println(place +"is not valid");
	return isAddedPlaces;
	}
	
	public void getPlaces()
	{
		System.out.println("\nTrip Places are...");
		for(String names : Places)
		System.out.println(names);
	}
}