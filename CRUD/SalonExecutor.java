class SalonExecutor
{
	public static void main(String[]sal)
	{
		Salon service = new Salon();
		
		boolean added = service.addServices("Hair Cutting");
		System.out.println(added);
		
		added = service.addServices("Hair Styling");
		System.out.println(added);
		
		added = service.addServices("Hair Coloring");
		System.out.println(added);
		
		added = service.addServices("Facial");
		System.out.println(added);
		
		added = service.addServices("Waxing");
		System.out.println(added);
		
		added = service.addServices("Spa");
		System.out.println(added);
		
		added = service.addServices("Nail Arts");
		System.out.println(added);
		
		service.getServices();
	}
}