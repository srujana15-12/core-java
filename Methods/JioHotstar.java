class JioHotstar
{
	static String comedyMovies[]={"Jathi Ratnalu","F2: Fun and Frustration","F3: Fun and Frustration","DJ Tillu","Tillu Square","Brochevarevarura","Venky","Dhee","Ready","Race Gurram","Nuvvu Naaku Nachav","Namo Venkatesa","Adhurs","King","Kick","Julayi","Sudigadu","Bhale Bhale Magadivoy","Pelli Choopulu","Ee Nagaraniki Emaindi","Ala Vaikunthapurramuloo","Bendu Apparao R.M.P","Allari","Kitakitalu","Sudigaadu 2","Hello Brother","Manmadhudu","Dubai Seenu","Chantabbai","Jamba Lakidi Pamba"};
	static String thrillerMovies[]={"Drishyam","Ratsasan","Andhadhun","Kahaani","Evaru","Hit: The First Case","Hit: The Second Case","Vikram Vedha","The Family Man","Shutter Island","Gone Girl","Se7en","The Silence of the Lambs","Prisoners","Zodiac","The Girl with the Dragon Tattoo","A Wednesday","Ugly","Talvar","Anjaam Pathiraa","Joseph","Kavaludaari","Game Over","Badla","Talaash","Memories","The Invisible Guest","Knives Out","The Sixth Sense","No Country for Old Men"};
	static String dramas[]={"Forrest Gump","The Shawshank Redemption","Green Book","The Pursuit of Happyness","A Beautiful Mind","Titanic","The Green Mile","12 Years a Slave","Parasite","Whiplash","The Social Network","Marriage Story","Manchester by the Sea","Taare Zameen Par","Dangal","Sita Ramam","96","Kumbalangi Nights","Joji","Super Deluxe","The Lunchbox","Barfi!","Udaan","Masaan","Thappad","Aruvi","C/o Kancharapalem","Uyare","The Father","Million Dollar Baby"};
	static String crimeMovies[]={"The Godfather","The Godfather Part II","Goodfellas","The Departed","Scarface","Pulp Fiction","Se7en","The Usual Suspects","Heat","Casino","City of God","No Country for Old Men","Zodiac","Donnie Brasco","American Gangster","A Wednesday","Special 26","Gangs of Wasseypur","Black Friday","Talvar","Drishyam","Vikram Vedha","Ratsasan","Kaithi","Anjaam Pathiraa","Joseph","Kavaludaari","Memories","The Irishman","Prisoners"};
	static String scienceFictionMovies[]={"Interstellar","Inception","The Matrix","The Matrix Reloaded","The Matrix Revolutions","Avatar","Avatar: The Way of Water","The Terminator","Terminator 2: Judgment Day","Blade Runner 2049","Arrival","Gravity","The Martian","Edge of Tomorrow","A Quiet Place","Ready Player One","Dune","Tenet","E.T. the Extra-Terrestrial","Jurassic Park","Jurassic World","PK","Enthiran","2.0","24","Aditya 369","Eega","Koi... Mil Gaya","War of the Worlds","I Am Legend"};
	static String adventureMovies[]={"Indiana Jones and the Raiders of the Lost Ark","Indiana Jones and the Last Crusade","The Lord of the Rings: The Fellowship of the Ring","The Lord of the Rings: The Two Towers","The Lord of the Rings: The Return of the King","The Hobbit: An Unexpected Journey","Pirates of the Caribbean: The Curse of the Black Pearl","Pirates of the Caribbean: Dead Man's Chest","Jurassic Park","Jurassic World","The Mummy","The Revenant","Life of Pi","Cast Away","Into the Wild","Jumanji: Welcome to the Jungle","Jumanji: The Next Level","Mad Max: Fury Road","The Chronicles of Narnia: The Lion, the Witch and the Wardrobe","King Kong","Baahubali: The Beginning","Baahubali: The Conclusion","RRR","Magadheera","Eega","Kantara","Thugs of Hindostan","The Jungle Book","Everest","The Secret Life of Walter Mitty"};
	
	public static void main(String[] args)
	{
		getComedyMovies();
		getThrillerMovies();
		getDramas();
		getCrimeMovies();
		getScienceFictionMovies();
		getAdventureMovies();
	}
	
	static void getComedyMovies()
	{
		System.out.println("List of Comedy Movies are:");
		for(String comedy:comedyMovies)
			System.out.println(comedy);
	}
	
	static void getThrillerMovies()
	{
		System.out.println("List of Thriller Movies are:");
		for(String thriller:thrillerMovies)
			System.out.println(thriller);
	}
	
	static void getDramas()
	{
		System.out.println("List of Drama Movies are:");
		for(String drama:dramas)
			System.out.println(drama);
	}
	
	static void getCrimeMovies()
	{
		System.out.println("List of Crime Movies are:");
		for(String crime:crimeMovies)
			System.out.println(crime);
	}
	
	static void getScienceFictionMovies()
	{
		System.out.println("List of Science Fiction Movies are:");
		for(String sciFi:scienceFictionMovies)
			System.out.println(sciFi);
	}
	
	static void getAdventureMovies()
	{
		System.out.println("List of Adventure Movies are:");
		for(String adventure:adventureMovies)
			System.out.println(adventure);
	}
}