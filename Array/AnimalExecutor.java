class AnimalExecutor
{
	public static void main(String[] args)
	{
		Animal a1=new Animal();
		a1.name="Lion";
		
		Animal a2=new Animal();
		a2.name="Tiger";
		
		Animal a3=new Animal();
		a3.name="Elephant";
		
		Animal a4=new Animal();
		a4.name="Dog";
		
		Animal a5=new Animal();
		a5.name="Cat";
		
		Animal a6=new Animal();
		a6.name="Horse";
		
		Animal a7=new Animal();
		a7.name="Cow";
		
		Animal a8=new Animal();
		a8.name="Goat";
		
		Animal a9=new Animal();
		a9.name="Deer";
		
		Animal a10=new Animal();
		a10.name="Monkey";
		
		Animal a11=new Animal();
		a11.name="Bear";
		
		Animal a12=new Animal();
		a12.name="Fox";
		
		Animal a13=new Animal();
		a13.name="Wolf";
		
		Animal a14=new Animal();
		a14.name="Zebra";
		
		Animal a15=new Animal();
		a15.name="Giraffe";
		
		Animal animals[]=new Animal[15];
		animals[0]=a1;
		animals[1]=a2;
		animals[2]=a3;
		animals[3]=a4;
		animals[4]=a5;
		animals[5]=a6;
		animals[6]=a7;
		animals[7]=a8;
		animals[8]=a9;
		animals[9]=a10;
		animals[10]=a11;
		animals[11]=a12;
		animals[12]=a13;
		animals[13]=a14;
		animals[14]=a15;
		
		for(Animal animal:animals)
			System.out.println(animal.name);
	}
}

