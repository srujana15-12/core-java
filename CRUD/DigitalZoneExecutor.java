class DigitalZoneExecutor
{
	public static void main(String[]zone)
	{
		DigitalZone brandNames = new DigitalZone();
		
		boolean added = brandNames.addLaptopBrandNames("Lenovo");
		System.out.println(added);
		
		added = brandNames.addLaptopBrandNames("HP");
		System.out.println(added);
		
		added = brandNames.addLaptopBrandNames("Dell");
		System.out.println(added);
		
		added = brandNames.addLaptopBrandNames("Mac");
		System.out.println(added);
		
		added = brandNames.addLaptopBrandNames("Vivobook");
		System.out.println(added);
		
		added = brandNames.addLaptopBrandNames("IdealPad");
		System.out.println(added);
		
		added = brandNames.addLaptopBrandNames("Apple");
		System.out.println(added);
		
		brandNames.getLaptopBrandNames();
	}
}
	