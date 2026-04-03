class Maggie
{
	String Ingredients[] = new String[12];
	int index;
	
	public boolean addIngredients(String ingredient)
	{
	boolean isAddedIngredients = false;
	if(ingredient != null && !ingredient.isEmpty()){
		Ingredients[index++] = ingredient;
		isAddedIngredients = true;
	}else
		System.out.println(ingredient +"is not valid");
	return isAddedIngredients;
	}
	
	public void getIngredients()
	{
		System.out.println("\nMaggie Ingredients are...");
		for(String names : Ingredients)
		System.out.println(names);
	}
}