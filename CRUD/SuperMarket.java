class SuperMarket
{
	String ProductNames[] = new String[8];
	int index;
	
	public boolean addProductNames(String productName)
	{
	boolean isAddedProductNames = false;
	if(productName != null && !productName.isEmpty()){
		ProductNames[index++] = productName;
		isAddedProductNames = true;
	}else
		System.out.println(productName +"is not valid");
	return isAddedProductNames;
	}
	
	public void getProductNames()
	{
		System.out.println("\nSuper Market Product Names are...");
		for(String names : ProductNames)
		System.out.println(names);
	}
}