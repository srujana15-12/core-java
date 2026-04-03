class ShowRoom
{
	String ManagerNames[] = new String[8];
	int index;
	
	public boolean addManagerNames(String managerName)
	{
	boolean isAddedManagerNames = false;
	if(managerName != null && !managerName.isEmpty()){
		ManagerNames[index++] = managerName;
		isAddedManagerNames = true;
	}else
		System.out.println(managerName +"is not valid");
	return isAddedManagerNames;
	}
	
	public void getManagerNames()
	{
		System.out.println("\nSalon Services are...");
		for(String names : ManagerNames)
		System.out.println(names);
	}
}