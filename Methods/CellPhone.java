class CellPhone
{
	static long contacts[]={9876543210l,9123456780l,9988776655l,9012345678l,8899001122l,9765432109l,9345678901l,9555666777l,9090909090l,9812345678l,9700011122l,9445566778l,9332211445l,9223344556l,9112233445l,9001122334l,9887766554l,9776655443l,9665544332l,9554433221l};
	
	public static void main(String[] args)
	{
		getContacts();
	}
	
	static void getContacts()
	{
		System.out.println("List of Contacts are:");
		for(long number:contacts)
			System.out.println(number);
	}
}