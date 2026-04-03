class StateElectionExecutor
{
	public static void main(String[]exe)
	{
		StateElection names = new StateElection();
		
		boolean added = names.addPartyNames("BJP");
		System.out.println(added);
		
		added = names.addPartyNames("INC");
		System.out.println(added);
		
		added = names.addPartyNames("AAP");
		System.out.println(added);
		
		added = names.addPartyNames("AITC");
		System.out.println(added);
		
		added = names.addPartyNames("DMK");
		System.out.println(added);
		
		added = names.addPartyNames("SP");
		System.out.println(added);
		
		added = names.addPartyNames("TDP");
		System.out.println(added);
			
		names.getPartyNames();
	}
}