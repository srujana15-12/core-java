class Universe
{
	String Galaxies[] = new String[11];
	int index;
	
	public boolean addGalaxiesInfo(String galaxie)
	{
	boolean isAddedGalaxies = false;
	if(galaxie != null && !galaxie.isEmpty()){
		Galaxies[index++] = galaxie;
		isAddedGalaxies = true;
	}else
		System.out.println(galaxie +"is not valid");
	return isAddedGalaxies;
	}
	
	public void getGalaxiesInfo()
	{
		System.out.println("\nGalaxies in Universe are...");
		for(String names : Galaxies)
		System.out.println(names);
	}
}