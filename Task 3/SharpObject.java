class SharpObject
{
	static String name;
	static String usesForProduct;
	static String brand;
	static String modelName;
	static String ageRange;
	static int includedComponents;
	static String bladeMaterails;
	static String colour;
	static String style;
	static double bladeLength;
	static String bladeShape;
	static String bladeEdge;
	public static void main(String[] args)
	{
		String name = "Viking Knife";
		String usesForProduct = "Camping,Peeling,Paring";
		String brand = "Machado";
		String modelName = "Damascus";
		String ageRange = "Adult";
		int includedComponents = 1;
		String bladeMaterails = "High Carbon Steel";
		String colour = "Sliver";
		String style = "Viking";
		double bladeLength = 10.2;
		String bladeShape = "Round";
		String bladeEdge = "Plain";

		System.out.println("Name: "+name);
		System.out.println("Uses For Product: "+usesForProduct);
		System.out.println("Brand: "+brand);
		System.out.println("Model Name: "+modelName);
		System.out.println("Age Range: "+ageRange);
		System.out.println("Included Components: "+includedComponents);
		System.out.println("Blade Materails: "+bladeMaterails);
		System.out.println("Colour: "+colour);
		System.out.println("Style: "+style);
		System.out.println("Blade Length: "+bladeLength);
		System.out.println("Blade Shape: "+bladeShape);
		System.out.println("Blade Edge: "+bladeEdge);
	}
}