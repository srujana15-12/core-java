class MovieExecutor
{
	public static void main(String[]exe)
	{
		Movie names = new Movie();
		
		boolean added = names.addCaste("Eleven");
		System.out.println(added);
		
		added = names.addCaste("Mike Wheeler");
		System.out.println(added);
		
		added = names.addCaste("Will Byers");
		System.out.println(added);
		
		added = names.addCaste("Lucas Sinclair");
		System.out.println(added);
		
		added = names.addCaste("Max Mayfield");
		System.out.println(added);
		
		added = names.addCaste("Dustin hende");
		System.out.println(added);
		
		added = names.addCaste("Steve Harrinton");
		System.out.println(added);
		
		added = names.addCaste("Jin Hopper");
		System.out.println(added);
		
		added = names.addCaste("Robbin Buckley");
		System.out.println(added);
		
		names.getCaste();
	}
}