class Lays
{
	static String ingredients[]={"Potato powder","Monoglyceride","Diglycerol Fatty Acid","Ester","Citric Acid","Vegetable oil","Pre gelantized starch","White granulated grains","Lactose","Edible salt","Potato","White granulated sugar","Monosodium glutamate","Yeast extract"};
	
	public static void main(String[] args)
	{
		getIngredients();
	}
	
	static void getIngredients()
	{
		System.out.println("List of Ingredients are:");
		for(String ingredient:ingredients)
			System.out.println(ingredient);
	}
}