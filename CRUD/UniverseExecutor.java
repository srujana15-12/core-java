class UniverseExecutor
{
	public static void main(String[]exe)
	{
		Universe galaxieName = new Universe();
		
		boolean added = galaxieName.addGalaxiesInfo("Milky Way");
		System.out.println(added);
		
		added = galaxieName.addGalaxiesInfo("Andromeda Galaxy");
		System.out.println(added);
		
		added = galaxieName.addGalaxiesInfo("Triangulum Galaxy");
		System.out.println(added);
		
		added = galaxieName.addGalaxiesInfo("Large Magellanic Cloud");
		System.out.println(added);
		
		added = galaxieName.addGalaxiesInfo("Small Magellanic Cloud");
		System.out.println(added);
		
		added = galaxieName.addGalaxiesInfo("Whirlpool Galaxy");
		System.out.println(added);
		
		added = galaxieName.addGalaxiesInfo("Sombrero Galaxy");
		System.out.println(added);
		
		added = galaxieName.addGalaxiesInfo("Black Eye Galaxy");
		System.out.println(added);
		
		added = galaxieName.addGalaxiesInfo("CartWheel Galaxy");
		System.out.println(added);
		
		added = galaxieName.addGalaxiesInfo("Antennae");
		System.out.println(added);
		
		added = galaxieName.addGalaxiesInfo("Hoags Object");
		System.out.println(added);
			
		galaxieName.getGalaxiesInfo();
	}
}