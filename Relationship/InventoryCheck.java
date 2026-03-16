class InventoryCheck
{
	public static void validate()
	{
		System.out.println("Validating inventory availability");
		WareHouse.fetchFromAisle();
	}
}