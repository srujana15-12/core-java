class OlympicExecutor
{
	public static void main(String[]exe)
	{
		Olympic sports = new Olympic();
		
		boolean added = sports.addSportsNames("Athletics");
		System.out.println(added);
		
		added = sports.addSportsNames("Swimming");
		System.out.println(added);
		
		added = sports.addSportsNames("Gymnastics");
		System.out.println(added);
		
		added = sports.addSportsNames("BasketBall");
		System.out.println(added);
		
		added = sports.addSportsNames("Boxing");
		System.out.println(added);
		
		added = sports.addSportsNames("Cycling");
		System.out.println(added);
		
		added = sports.addSportsNames("Tennis");
		System.out.println(added);
		
		added = sports.addSportsNames("Soccer");
		System.out.println(added);
		
		added = sports.addSportsNames("Skiing");
		System.out.println(added);
		
		added = sports.addSportsNames("Ice Hockey");
		System.out.println(added);
		
		added = sports.addSportsNames("Figure Skating");
		System.out.println(added);
			
		sports.getSportsNames();
	}
}