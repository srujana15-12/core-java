class ZeeFive
{
	static String teluguSeries[]={"Loser","Locked","Meka Suri","Recce","Maa Neella Tank","Oka Chinna Family Story","Prema Entha Madhuram","Kalyana Vaibhogam","No.1 Kodalu","Suryakantham","Trinayani","Krishna Tulasi","Radhamma Kuthuru","Hitler Gari Pellam","Devathalara Deevinchandi","Inti Guttu","Kalyana Vaibhogam (2022)","Mutyala Muggu","Varudhini Parinayam","Mana Ambedkar","Muddha Mandaram","Mangamma Gari Manavaralu","Gundamma Katha (Series)","Ninne Pelladatha (Zee5)","America Ammayi","Adhikar","Ammayi Garu","Ramaraju","Chadarangam","Vyavastha"};
	static String kannadaSeries[]={"Gattimela","Jothe Jotheyali","Yaare Nee Mohini","Kamali","Paaru","Naagini 2","Brahmagantu","Subbalakshmi Samsara","Sathya","Kinnari","Radha Ramana","Ganga","Mahadevi","Mangala Gowri Maduve","Nagamandala","Arundhati","Seetha Vallabha","Kaveri","Krishna Rukmini","Anuroopa","Nigooda Ratri","Edheyo","Hoo Male","Mahanati","Anjali","Sose Tanda Sowbhagya","Putmalli","Jodi Hakki","Shubhavivaha","Bandhana"};
	static String tamilSeries[]={"Sembaruthi","Yaaradi Nee Mohini","Poove Poochoodava","Sathya","Oru Oorula Oru Rajakumari","Rettai Roja","Devathaiyai Kanden","Neethane Enthan Ponvasantham","Peranbu","Rajamagal","Maari","Chithiram Pesuthadi","Thirumathi Hitler","Ninaithale Inikkum","Kannathil Muthamittal (Series)","Amudhavum Annalakshmiyum","Vidhya No.1","Karthigai Deepam","Anna","Sandhya Raagam","Meenakshi Ponnunga","Idhayam","Anbe Sivam (Series)","Suryavamsam (Series)","Veera","Pudhu Pudhu Arthangal","Nenjathai Killathe (Series)","Thavamai Thavamirundhu (Series)","Thalayanai Pookal","Uyire"};
	static String malayalamSeries[]={"Chembarathi","Neeyum Njanum","Kaiyethum Doorath","Mrs Hitler","Kudumbashree Sharada","Mizhi Randilum","Manam Pole Mangalyam","Sathya Enna Penkutty","Sumangali Bhava","Pookalam Varavayi","Suryakanthi","Ayalathe Sundari","Moonnumani","Mangalyam","Swathi Nakshatram Chothi","Pranayavarnangal","Bharya","Bandhanam","Makkal","Nokketha Doorathu","Shyamambaram","Snehakoodu","Karthika Deepam (Malayalam)","Ammayariyathe","Nandanam","Indira","Arayannangalude Veedu","Kudumbavilakku","Ente Maathavu","Seetha Kalyanam"};
	static String englishSeries[]={"The Broken News","Abhay","Sunflower","Kaafir","Rangbaaz","Rangbaaz: Darr Ki Rajneeti","State of Siege: 26/11","State of Siege: Temple Attack","Poison","Poison 2","Duranga","Duranga 2","Code M","Code M 2","Karenjit Kaur","The Final Call","Lalbazaar","Bombers","Naxalbari","Black Widows","Bloody Brothers","Tripling","Never Kiss Your Best Friend","Fittrat","Bicchoo Ka Khel","Jeet Ki Zid","REJCTX","High Priestess","The Married Woman","Smoke"};
	static String hindiSeries[]={"Abhay","Rangbaaz","Rangbaaz: Darr Ki Rajneeti","Sunflower","Kaafir","State of Siege: 26/11","State of Siege: Temple Attack","Poison","Poison 2","Duranga","Duranga 2","Code M","Code M 2","Karenjit Kaur","The Final Call","Lalbazaar","Bombers","Naxalbari","Black Widows","Bloody Brothers","Tripling","Never Kiss Your Best Friend","Fittrat","Bicchoo Ka Khel","Jeet Ki Zid","REJCTX","High Priestess","The Married Woman","Smoke","Taj: Divided by Blood"};
	
	public static void main(String[] args)
	{
		getTeluguSeries();
		getKannadaSeries();
		getTamilSeries();
		getMalayalamSeries();
		getEnglishSeries();
		getHindiSeries();
	}
	
	static void getTeluguSeries()
	{
		System.out.println("List of Telugu Series are:");
		for(String item:teluguSeries)
			System.out.println(item);
	}
	
	static void getKannadaSeries()
	{
		System.out.println("List of Kannada Series are:");
		for(String item:kannadaSeries)
			System.out.println(item);
	}
	
	static void getTamilSeries()
	{
		System.out.println("List of Tamil Series are:");
		for(String item:tamilSeries)
			System.out.println(item);
	}
	
	static void getMalayalamSeries()
	{
		System.out.println("List of Malayalam Series are:");
		for(String item:malayalamSeries)
			System.out.println(item);
	}
	
	static void getEnglishSeries()
	{
		System.out.println("List of English Series are:");
		for(String item:englishSeries)
			System.out.println(item);
	}
	
	static void getHindiSeries()
	{
		System.out.println("List of Hindi Series are:");
		for(String item:hindiSeries)
			System.out.println(item);
	}
}