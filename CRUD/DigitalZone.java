class DigitalZone
{
	String laptopBrandNames[] = new String[6];
	int index;
	
	public boolean addLaptopBrandNames(String brandName)
	{
		
		boolean isAddedBrandNames = false;
		if(index < laptopBrandNames.length){
		if(brandName != null && !brandName.isEmpty())
		{
			laptopBrandNames[index++] = brandName;
			isAddedBrandNames = true;
		}else
			System.out.println(brandName + "is not valid");
		}else
			System.out.println("This laptop Brand are not available...right now");
		
		return isAddedBrandNames;	
	}
	
	public void getLaptopBrandNames()
	{
		System.out.println("\nLaptop Brand Names are....");
		for(String names : laptopBrandNames)
		System.out.println(names);
	}
}