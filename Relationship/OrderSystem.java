class OrderSystem
{
	public static void takeOrder()
	{
		System.out.println("Customer order received");
		InventoryCheck.validate();
	}
}