class DeliveryAgent
{
	public static void reachDoorStep()
	{
		System.out.println("Delivery agent reached customer doorstep");
		SignaturePortal.collectESign();
	}
}