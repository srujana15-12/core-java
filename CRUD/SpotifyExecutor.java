class SpotifyExecutor
{
	public static void main(String[]exe)
	{
		Spotify songs = new Spotify();
		
		boolean added = songs.addSongsNames("Running up that Hill");
		System.out.println(added);
		
		added = songs.addSongsNames("Rock that Body");
		System.out.println(added);
		
		added = songs.addSongsNames("Bol Do Na Zara");
		System.out.println(added);
		
		added = songs.addSongsNames("Labon Ko");
		System.out.println(added);
		
		added = songs.addSongsNames("Tulasi");
		System.out.println(added);
		
		added = songs.addSongsNames("No problem");
		System.out.println(added);
		
		added = songs.addSongsNames("Ale Ale");
		System.out.println(added);
		
		added = songs.addSongsNames("Me&You");
		System.out.println(added);
		
		added = songs.addSongsNames("Amlodipine");
		System.out.println(added);
		
		added = songs.addSongsNames("Helu Shiva");
		System.out.println(added);
			
		songs.getSongsNames();
	}
}