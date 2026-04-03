class Salon
{
	String Services[] = new String[7];
	int index;
	
	public boolean addServices(String services)
	{
	boolean isAddedServices = false;
	if(services != null && !services.isEmpty()){
		Services[index++] = services;
		isAddedServices = true;
	}else
		System.out.println(services +"is not available");
	return isAddedServices;
	}
	
	public void getServices()
	{
		System.out.println("\nSalon Services are...");
		for(String service : Services)
		System.out.println(service);
	}
}