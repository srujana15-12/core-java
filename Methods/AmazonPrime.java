class AmazonPrime
{
	static String teluguMovies[]={"Cheekatilo","Uppu Kappurambu","Drive","JIGRIS","23 (Iravai Moodu)","Hathya","Kalki 2898 AD","Hit (The First Case)","Naari Naari Naduma Murari","V","Maharshi","F2 - Fun and Frustration","Whistle","Evaru","28 Degree Celsius","Game Changer","Chaurya Paatham","Saaho","Pushpa: The Rise","HIT: The Second Case","Acharya","Yashoda","Ee Nagaraniki Emaindi","Guvva Gorinka","NOTA","Radhe Shyam","Vakeel Saab","Sarkaru Vaari Paata","Goodachari","Majili"};
	static String kannadaMovies[]={"Dia","Rathnan Prapancha","Law","One Cut Two Cut","Ikkat","French Biriyani","K.G.F: Chapter 1","K.G.F: Chapter 2","Gantumoote","Love Mocktail","Avane Srimannarayana","Kavalu Daari","Rathaavara","Nanna Prakara","Katheyondu Shuruvagide","777 Charlie","Pailwaan","Bell Bottom","Yuvarathnaa","Kantara","Roberrt","Raajakumara","James","Ugramm","Mufti","Tagaru","Kirrak Party","Ondu Motteya Kathe","Simple Agi Ondh Love Story","Godhi Banna Sadharana Mykattu"};
	static String tamilMovies[]={"Anbe Sivam","Nayakan","Pariyerum Perumal","Thevar Magan","Saani Kaayidham","Mahaan","Udanpirappe","Raame Aandalum Raavane Aandalum","Soorarai Pottru","Saani Kaayidham","Vikram Vedha","Saani Kaayidham","96","Bheemaa","Alaipayuthey","Kodi","Kaala","Mouna Ragam","OK Kanmani","Putham Pudhu Kaalai","Thadam","Uriyadi","Vellai Pookal","Seethakaathi","Manmadhan","Annamalai","Bombay","Vikram","Saani Kaayidham Redux","Thani Oruvan"};
	static String malayalamMovies[]={"Drishyam","Drishyam 2","Aavesham","Golam","Pachuvum Athbutha Vilakkum","Ittymaani: Made in China","Charles Enterprises","Pathinettam Padi","Cold Case","Ela Veezha Poonchira","Kooman","C U Soon","Joseph","Nizhal","Kumbalangi Nights","Joji","Ayyappanum Koshiyum","Kaathal – The Core","Bhramam","Sara's","Helen","Unda","Virus","Garudan","Malik","The Great Indian Kitchen","Android Kunjappan Version 5.25","Uyare","Thondimuthalum Driksakshiyum","Take Off"};
	static String hindiMovies[]={"Shershaah","Sardar Udham","Maja Ma","Tiku Weds Sheru","Sharmajee Ki Beti","Ae Watan Mere Watan","Runway 34","Jug Jugg Jeeyo","Yeh Jawaani Hai Deewani","Barfi!","Raazi","The Lunchbox","Tumbbad","Stree","Section 375","Hindi Medium","Aashiqui 2","Raja Hindustani","Hum Dil De Chuke Sanam","Ajab Prem Ki Ghazab Kahani","Bachchhan Paandey","Unpaused","Toofaan","Gehraiyaan","Bhoot: Part One - The Haunted Ship","Fan","Satyameva Jayate","Coolie No. 1","Dil Bechara","Good Newwz"};
	static String englishMovies[]={"The Shawshank Redemption","The Lord of the Rings: The Fellowship of the Ring","The Lord of the Rings: The Two Towers","The Lord of the Rings: The Return of the King","The Matrix","Inception","Interstellar","Gladiator","The Dark Knight","Titanic","Forrest Gump","The Prestige","Arrival","The Silence of the Lambs","The Social Network","Mad Max: Fury Road","The Wolf of Wall Street","A Quiet Place","The Tomorrow War","Mission: Impossible – Fallout","No Time to Die","Casino Royale","The Beekeeper","The Big Lebowski","La La Land","Ready Player One","Collateral","Fargo","Red, White & Royal Blue","Upgraded"};
	
	public static void main(String[] prime)
	{
	   getTeluguMovies();
	   getKannadaMovies();
	   getTamilMovies();
	   getMalayalamMovies();
	   getHindiMovies();
	   getEnglishMovies();	   
	}
	static void getTeluguMovies()
	{
		System.out.println("List of Telugu Movies are:");
		for(String telugu:teluguMovies)
			System.out.println(telugu);
	}
	static void getKannadaMovies()
	{
		System.out.println("List of Kannada Movies are:");
		for(String kannada:kannadaMovies)
			System.out.println(kannada);
	}
	static void getTamilMovies()
	{
		System.out.println("List of Tamil Movies are:");
		for(String tamil:tamilMovies)
			System.out.println(tamil);
	}
	static void getMalayalamMovies()
	{
		System.out.println("List of malayalam Movies are:");
		for(String malayalam:malayalamMovies)
			System.out.println(malayalam);
	}
	static void getHindiMovies()
	{
		System.out.println("List of Hindi Movies are:");
		for(String hindi:hindiMovies)
			System.out.println(hindi);
	}
	static void getEnglishMovies()
	{
		System.out.println("List of English Movies are:");
		for(String english:englishMovies)
			System.out.println(english);
	}
}	

	