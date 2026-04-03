class MedicalShop
{
	String MedicineNames[] = new String[10];
	int index;
	
	public boolean addMedicineNames(String medicineName)
	{
	boolean isAddedMedicineNames = false;
	if(medicineName != null && !medicineName.isEmpty()){
		MedicineNames[index++] = medicineName;
		isAddedMedicineNames = true;
	}else
		System.out.println(medicineName +"is not valid");
	return isAddedMedicineNames;
	}
	
	public void getMedicineNames()
	{
		System.out.println("\nMedicine are available in Medical Shop are...");
		for(String names : MedicineNames)
		System.out.println(names);
	}
}