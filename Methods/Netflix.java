class Netflix
{
	static String biographical[]={"The chosen","Chhaava","Bison","Gunjan Saxena","Dangal","Emergency","Srikanth","Veerappan","Major","Khakee","Kurup","Spy","Aganist the ice","The Crown","14 Peaks","The Empress","Thalaivii","Sanju","Queen of Chess","Einstein and the Bomb","Harriet","Operation Finale","The Angel","The Good Nurse","The Getaway King","The Resistance Banket","Sergio","Gran Turismo","The King","Business"};
	static String documentaries[]={"Life on our planet","India vs Pakistan","America Manhunt","Hitler and the Nazis","Testament the story of Moses","World warII","Alexander","Bad boy billionaires","Dinning with the kapoors","Mumbai Mafia","Ottoman","how to get rich","Veerapan","Elephant Whisperes","Our Universe","Roman Empire","Queen of chess","Pop star academic","14 Peaks","The last dance","Wild wild country","Our planetII","One last adventure","House of secrets","Thee social dilemma","Blackpink","Predators","Inside job","Captains of the world","Einstein and the bomb"};
	static String blockBusters[]={"Guntur Kaaram","Pushpa","Puspha2","KGF","KGF2","Animal","Fast and furious2","Chhaava","Salaar","Chennai Express","Retro","Yeh javaani hai deewani","Dangal","Sultan","Dhoom2","Dhoom3","Bajarangi Bhaijaan","Shtter Island","Fast and Furious","Jumanji","Furious7","Mowgli","Leo","RRR","Kalki","Baahubali","Jawan","Happy new year","ABCD","Dilwale"};
	static String horror[]={"All of us are dead","Stranger Things","Frankesnstein","The walking dead","Virupaksha","Sweet home","Bhool bhulaiyaa3","The Order","Don't come home","Chandramuki","Baramulla","Hell round","Ziam","Army of the dead","Under paris","The elixir","Conjuring","Ghost stories","Alive","28 Years later","Kumari","Haunting","Shaitaan","Dracula","Abigail","Day shift","Maa","Resident Evil","The NUN","Bhoomika"};
	static String fantasy[]={"My girlfriend is an Alien","Lucifer","Ra-One","One piece","Wednesday","Kurukshetra","Genie make a wish","Shadow Bone","Sweet tooth ","The last airbender","Till the end of the moon","Alchemy of souls","Jumaji","The sea beast","Thangalaam","Damsel","Bro","The Vampire Diaries","The sandman","the wicher","Mowgli","Troll1","Lock & key","Adipurush","PK","Seventh son","Naruto","Cursed","Devil may cry","Family pack"};
	static String action[]={"Daaku maharaaj","Dhurandhar","Mahavatar narsimha","Chhaava","Salaar","Guntur kaaram","onepiece","Chennai express","Animal","The witcher","OG","Pushpa2","Pushpa","Thammudu","Jaat","War2","The greatest of all time","Kung fu hustle","the last kingdom","Dhoom3","RRR","Retro","Thug life","Sikandar","Jack","Akhanda","Beast","Kalki","Saaho","Thandel"};
	
	public static void main(String[] args)
	{
		getBiographical();
		getDocumentaries();
		getBlockBusters();
		getHorror();
		getFantasy();
		getAction();
	}
	
	static void getBiographical()
	{
		System.out.println("List of Biographical Movies are:");
		for(String item:biographical)
			System.out.println(item);
	}
	
	static void getDocumentaries()
	{
		System.out.println("List of Documentaries are:");
		for(String item:documentaries)
			System.out.println(item);
	}
	
	static void getBlockBusters()
	{
		System.out.println("List of Blockbuster Movies are:");
		for(String item:blockBusters)
			System.out.println(item);
	}
	
	static void getHorror()
	{
		System.out.println("List of Horror Movies are:");
		for(String item:horror)
			System.out.println(item);
	}
	
	static void getFantasy()
	{
		System.out.println("List of Fantasy Movies are:");
		for(String item:fantasy)
			System.out.println(item);
	}
	
	static void getAction()
	{
		System.out.println("List of Action Movies are:");
		for(String item:action)
			System.out.println(item);
	}
}