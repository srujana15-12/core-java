class ShowRoomExecutor
{
	public static void main(String[]show)
	{
		ShowRoom managerNames = new ShowRoom();
		
		boolean added = managerNames.addManagerNames("Rohith");
		System.out.println(added);
		
		added = managerNames.addManagerNames("Hanuman");
		System.out.println(added);
		
		added = managerNames.addManagerNames("Lakshmi");
		System.out.println(added);
		
		added = managerNames.addManagerNames("Ganesh");
		System.out.println(added);
		
		added = managerNames.addManagerNames("Parvathi");
		System.out.println(added);
		
		added = managerNames.addManagerNames("Shiv");
		System.out.println(added);
		
		added = managerNames.addManagerNames("sita");
		System.out.println(added);
		
		added = managerNames.addManagerNames("Ram");
		System.out.println(added);
		
		managerNames.getManagerNames();
	}
}