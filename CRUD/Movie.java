class Movie
{
	String Caste[] = new String[9];
	int index;
	
	public boolean addCaste(String caste)
	{
	boolean isAddedCaste = false;
	if(caste != null && !caste.isEmpty()){
		Caste[index++] = caste;
		isAddedCaste = true;
	}else
		System.out.println(caste +"is not valid");
	return isAddedCaste;
	}
	
	public void getCaste()
	{
		System.out.println("\nStranger Things Series Caste are...");
		for(String names : Caste)
		System.out.println(names);
	}
}