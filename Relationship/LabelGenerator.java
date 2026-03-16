class LabelGenerator
{
	public static void printLabel()
	{
		System.out.println("Generating shipping label");
		CarrierService.pickUpPackage();
	}
}