class StudentExecutor
{
	public static void main(String[] stu)
	{
		Student s1=new Student();
		s1.name="Srujana";
		
		Student s2=new Student();
		s2.name="Shrushravya";
		
		Student s3=new Student();
		s3.name="Sahana";
		
		Student s4=new Student();
		s4.name="Spoorthi";
		
		Student s5=new Student();
		s5.name="Sneha";
		
		Student s6=new Student();
		s6.name="Manvitha";
		
		Student s7=new Student();
		s7.name="Naitvik";
		
		Student s8=new Student();
		s8.name="Rudransh";
		
		Student s9=new Student();
		s9.name="Mithun";
		
		Student s10=new Student();
		s10.name="Niharika";
		
		Student s11=new Student();
		s11.name="Namratha";
		
		Student s12=new Student();
		s12.name="Pratham";
		
		Student s13=new Student();
		s13.name="Preetham";
		
		Student s14=new Student();
		s14.name="Radhika";
		
		Student s15=new Student();
		s15.name="Jagadish";
		
		Student stud[]=new Student[15];
		stud[0]=s1;
		stud[1]=s2;
		stud[2]=s3;
		stud[3]=s4;
		stud[4]=s5;
		stud[5]=s6;
		stud[6]=s7;
		stud[7]=s8;
		stud[8]=s9;
		stud[9]=s10;
		stud[10]=s11;
		stud[11]=s12;
		stud[12]=s13;
		stud[13]=s14;
		stud[14]=s15;
		
		for(Student students:stud)
			System.out.println(students.name);
	}
}