class Country
{
	String states[]=new String[29];
	int index;
	
	public boolean addStateNames(String state)
	{
		boolean isStatesAdded=false;
		if(state!=null && !state.isEmpty())
		{
			states[index++]=state;
			isStatesAdded=true;
		}
		else
			System.out.println(state+"state not found");
			
		return isStatesAdded;
	}
	public void getStateDetails()
	{
		System.out.println("The list of States are:");
		for(String country:states)
			System.out.println(country);
	}
}