class WashingMachine
{
	static String productName;	
	static String productDimensions;	
	static String brand;	
	static String capacity;	
	static String specialFeature;	
	static String accessLocation; 

	public static void main(String[] args)
	{
		productName="Samsung 7 kg WashingMachine";   
		System.out.println("Product Name:"+productName);
		productDimensions="55D x 60W x 85H Centimeters";
		System.out.println("productDimensions:"+productDimensions);
		brand="Samsung";
		System.out.println("brand:"+brand);
		capacity="7 Kilograms";
		System.out.println("capacity:"+capacity);
		specialFeature="Child Lock, Diamond Drum, Hygiene Steam, Inverter, Quick Wash";
		System.out.println("specialFeature:"+specialFeature);
		accessLocation="Front Load";
		System.out.println("accessLocation:"+accessLocation);
	}
}