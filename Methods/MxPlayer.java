class MxPlayer
{
	static String mystery[]={"Aashram","Hello Mini","Ek Thi Begum","Ek Thi Begum 2","Bhaukaal","Bhaukaal 2","Matsya Kaand","Raktanchal","Raktanchal 2","Queen","High","Nakaab","Runaway Lugaai","Indori Ishq","Campus Diaries","Roohaniyat","Shiksha Mandal","Bisaat","Bad Trip","Times of Music","Sutliyan","Dangerous","Only For Singles","The Missing Stone","Girgit","Shukla The Terror","Sanak Ek Junoon","Fuh Se Fantasy","Hey Prabhu","YOLO"};
	static String mythology[]={"Ramayan","Mahabharat","Shri Krishna","Vighnaharta Ganesh","Siya Ke Ram","Devon Ke Dev Mahadev","RadhaKrishn","Karmaphal Daata Shani","Paramavatar Shri Krishna","Sankat Mochan Mahabali Hanuman","Shani","Jag Janani Maa Vaishno Devi","Baal Veer","Baal Krishna","Mahima Shani Dev Ki","Jai Jai Jai Bajrang Bali","Shree Ganesh","Vishnu Puran","Om Namah Shivay","Sai Baba","Mahakali","Kahaan Hum Kahaan Tum (Myth Track)","Devi Adi Parashakti","Brahmarakshas","Chandrakanta","Alif Laila","Vikram Betaal","Hatim","Jai Santoshi Maa","Jai Shri Ram"};
	static String sports[]={"Cricket Heroes","The Test Case","The Greatest Rivalry","Football Dreams","Sports Buzz","The Captain's Log","Maradona Special","IPL Special Stories","Champion’s Journey","Fit India","Kho Kho League","Hockey India Special","Kabaddi League Stories","Badminton Diaries","Boxing Legends","Wrestling Warriors","Road to Olympics","Champion Mindset","Sports Unplugged","Game On","India Wins","Legends of Cricket","The Final Match","Sports Ka Superstar","Run India Run","Stadium Stories","Goal Post","Cricket Fever","Sports Adda","Winning Moment"};
	static String family[]={"Sutliyan","Pati Patni Aur Panga","Gutar Gu","Jab We Matched","Ishq Express","Only For Singles","Ratri Ke Yatri","YOLO","Hey Prabhu","Flames","Please Find Attached","Hostages","Crushed","Love Ok Please","Jamnapaar","Rishton Ka Live Telecast","Half CA","Physics Wallah","Aashram","Roohaniyat","Queen","Bisaat","Shiksha Mandal","Runaway Lugaai","High","Indori Ishq","Campus Diaries","Times of Music","Dangerous","Hello Mini"};
	static String historical[]={"Raktanchal","Raktanchal 2","Queen","Bhaukaal","Bhaukaal 2","Matsya Kaand","Shiksha Mandal","Aashram","Ek Thi Begum","Ek Thi Begum 2","The Forgotten Army","Samvidhaan","Pradhanmantri","Netaji","Jhansi Ki Rani","Chanakya","Bharat Ek Khoj","Veer Shivaji","The Legend of Bhagat Singh (Series)","Sardar","Rajneeti Special","1962 The War","Battle of Saragarhi","Razia Sultan","Ashoka","Tipu Sultan","Maharana Pratap","Chittor Ki Rani","The Revolutionaries","Swatantrya Veer Savarkar"};
	static String animation[]={"Chhota Bheem","Motu Patlu","Shiva","Rudra","Vir The Robot Boy","Little Singham","Golmaal Jr","Pakdam Pakdai","Bandbudh Aur Budbak","Oggy and the Cockroaches","Mr Bean Animated","Tom and Jerry","Power Rangers","Ben 10","Slugterra","Pokemon","Beyblade","Roll No 21","Chorr Police","Honey Bunny","Bhoot Bandhus","Kumbh Karan","Gattu Battu","Titoo","Lambu G Tingu G","Mighty Raju","Super Bheem","Bhaago KK Aaya","Eena Meena Deeka","Jungle Book Animated"};
	
	public static void main(String[] args)
	{
		getMystery();
		getMythology();
		getSports();
		getFamily();
		getHistorical();
		getAnimation();
	}
	
	static void getMystery()
	{
		System.out.println("List of Mystery Series are:");
		for(String item:mystery)
			System.out.println(item);
	}
	
	static void getMythology()
	{
		System.out.println("List of Mythology Series are:");
		for(String item:mythology)
			System.out.println(item);
	}
	
	static void getSports()
	{
		System.out.println("List of Sports Series are:");
		for(String item:sports)
			System.out.println(item);
	}
	
	static void getFamily()
	{
		System.out.println("List of Family Series are:");
		for(String item:family)
			System.out.println(item);
	}
	
	static void getHistorical()
	{
		System.out.println("List of Historical Series are:");
		for(String item:historical)
			System.out.println(item);
	}
	
	static void getAnimation()
	{
		System.out.println("List of Animation Series are:");
		for(String item:animation)
			System.out.println(item);
	}
}