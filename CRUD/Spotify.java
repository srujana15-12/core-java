class Spotify
{
	String SongsNames[] = new String[10];
	int index;
	
	public boolean addSongsNames(String songsName)
	{
	boolean isAddedSongsNames = false;
	if(songsName != null && !songsName.isEmpty()){
		SongsNames[index++] = songsName;
		isAddedSongsNames = true;
	}else
		System.out.println(songsName +"is not valid");
	return isAddedSongsNames;
	}
	
	public void getSongsNames()
	{
		System.out.println("\nSonges are available in Spotify are...");
		for(String names : SongsNames)
		System.out.println(names);
	}
}