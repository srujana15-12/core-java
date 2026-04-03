class TripExecutor
{
	public static void main(String[]exe)
	{
		Trip names = new Trip();
		
		boolean added = names.addPlaces("Shimoga");
		System.out.println(added);
		
		added = names.addPlaces("Chikkamangalur");
		System.out.println(added);
		
		added = names.addPlaces("Hassan");
		System.out.println(added);
		
		added = names.addPlaces("Nandi Hill");
		System.out.println(added);
		
		added = names.addPlaces("Deviramma Temple");
		System.out.println(added);
		
		added = names.addPlaces("Jog Falls");
		System.out.println(added);
		
		added = names.addPlaces("goa");
		System.out.println(added);
		
		added = names.addPlaces("Kalle thigri");
		System.out.println(added);
		
		added = names.addPlaces("Mulayan giri Mountain");
		System.out.println(added);
		
		added = names.addPlaces("Yethina Bujja");
		System.out.println(added);
		
		added = names.addPlaces("Sakleshpur");
		System.out.println(added);
		
		added = names.addPlaces("Hampi");
		System.out.println(added);
		
		added = names.addPlaces("Chamundi Betta");
		System.out.println(added);
			
		names.getPlaces();
	}
}