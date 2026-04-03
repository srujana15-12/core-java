class SuperMarketExecutor
{
	public static void main(String[]show)
	{
		SuperMarket names = new SuperMarket();
		
		boolean added = names.addProductNames("Comb");
		System.out.println(added);
		
		added = names.addProductNames("Icecream");
		System.out.println(added);
		
		added = names.addProductNames("Books");
		System.out.println(added);
		
		added = names.addProductNames("Glass");
		System.out.println(added);
		
		added = names.addProductNames("Plate");
		System.out.println(added);
		
		added = names.addProductNames("Show Piece");
		System.out.println(added);
		
		added = names.addProductNames("Towel");
		System.out.println(added);
		
		added = names.addProductNames("Bed Sheets");
		System.out.println(added);
		
		names.getProductNames();
	}
}