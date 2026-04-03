class MedicalShopExecutor
{
	public static void main(String[]exe)
	{
		MedicalShop names = new MedicalShop();
		
		boolean added = names.addMedicineNames("Paracetamol");
		System.out.println(added);
		
		added = names.addMedicineNames("Ibuprofen");
		System.out.println(added);
		
		added = names.addMedicineNames("Amoxicillin");
		System.out.println(added);
		
		added = names.addMedicineNames("Atorvastatin");
		System.out.println(added);
		
		added = names.addMedicineNames("Metformin");
		System.out.println(added);
		
		added = names.addMedicineNames("Lisinopril");
		System.out.println(added);
		
		added = names.addMedicineNames("Levothyroxine");
		System.out.println(added);
		
		added = names.addMedicineNames("Omeprazole");
		System.out.println(added);
		
		added = names.addMedicineNames("Amlodipine");
		System.out.println(added);
		
		added = names.addMedicineNames("Albuterol");
		System.out.println(added);
			
		names.getMedicineNames();
	}
}