class SouthIndiaExecutor
{
	public static void main(String[]india)
	{
		SouthIndia names = new SouthIndia();
		
		boolean added = names.addAirportNames("Indira Gandhi International Airport");
		System.out.println(added);
		
		added = names.addAirportNames("Kempegowda International Airport");
		System.out.println(added);
		
		added = names.addAirportNames("Chhatrapati Shivaji Maharaj International Airport");
		System.out.println(added);
		
		added = names.addAirportNames("Chennai International Airport");
		System.out.println(added);
		
		added = names.addAirportNames("Netaji Subhash Chandra Bose International Airport");
		System.out.println(added);
		
		added = names.addAirportNames("Rajiv Gandhi International Airport");
		System.out.println(added);
		
		added = names.addAirportNames("Cochin International Airport");
		System.out.println(added);
		
		added = names.addAirportNames("Sardar Vallabhbhai Patel International Airport");
		System.out.println(added);
		
		added = names.addAirportNames("trivandrum International Airport");
		System.out.println(added);
		
		names.getAirportNames();
	}
}