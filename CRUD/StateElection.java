class StateElection
{
	String PartyNames[] = new String[9];
	int index;
	
	public boolean addPartyNames(String partyName)
	{
	boolean isAddedPartyNames = false;
	if(partyName != null && !partyName.isEmpty()){
		PartyNames[index++] = partyName;
		isAddedPartyNames = true;
	}else
		System.out.println(partyName +"is not valid");
	return isAddedPartyNames;
	}
	
	public void getPartyNames()
	{
		System.out.println("\nState Election Party Names are...");
		for(String names : PartyNames)
		System.out.println(names);
	}
}