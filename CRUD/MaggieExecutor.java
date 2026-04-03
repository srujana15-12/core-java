class MaggieExecutor
{
	public static void main(String[]exe)
	{
		Maggie names = new Maggie();
		
		boolean added = names.addIngredients("Maida");
		System.out.println(added);
		
		added = names.addIngredients("Palm Oil");
		System.out.println(added);
		
		added = names.addIngredients("Lodized Salt");
		System.out.println(added);
		
		added = names.addIngredients("Wheat Gluten");
		System.out.println(added);
		
		added = names.addIngredients("Onion Powder");
		System.out.println(added);
		
		added = names.addIngredients("Coriander Powder");
		System.out.println(added);
		
		added = names.addIngredients("Red Chilli Powder");
		System.out.println(added);
		
		added = names.addIngredients("Turmeric Powder");
		System.out.println(added);
		
		added = names.addIngredients("Garlic Powder");
		System.out.println(added);
		
		added = names.addIngredients("Hydrolyzed Peanut");
		System.out.println(added);
		
		added = names.addIngredients("Sugar");
		System.out.println(added);
		
		added = names.addIngredients("Cumin Powder");
		System.out.println(added);
			
		names.getIngredients();
	}
}