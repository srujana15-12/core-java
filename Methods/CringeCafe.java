class CringeCafe
{
	static String teaNames[]={"Green tea","Lemon tea","Masala tea","Ginger tea","Elachi tea","Amruth tea"};
	static String coffeeNames[]={"Cappuchino","Cold coffee","Hot coffee","Espresso","Latte","Mocha","Flat white","Cartado","Cold Brew","Filter Coffee","Lungo","Long back","Red Eye","Doppio","Affogato","Irish"};
	static String snacks[]={"Cake","Desert","Croissants","Muffins","Pastries","Cookies","Sandwiches","Baked savory","Fried Bites","Pizza","Tacos","Nuts and Fruit mix"};
	
	public static void main(String[] cafe)
	{
		getTeaNames();
		getCoffeeNames();
		getSnacks();
	}
	
	static void getTeaNames()
	{
		System.out.println("List of Tea Names are:");
		for(String tea:teaNames)
			System.out.println(tea);
	}
	
	static void getCoffeeNames()
	{
		System.out.println("List of Coffee Names are:");
		for(String coffee:coffeeNames)
			System.out.println(coffee);
	}
	
	static void getSnacks()
	{
		System.out.println("List of Snacks are:");
		for(String snack:snacks)
			System.out.println(snack);
	}
}