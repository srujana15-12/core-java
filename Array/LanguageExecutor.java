class LanguageExecutor
{
	public static void main(String[] languages)
	{
		Language l1=new Language();
		l1.name="Kannada";
		
		Language l2=new Language();
		l2.name="Telugu";
		
		Language l3=new Language();
		l3.name="Hindi";
		
		Language l4=new Language();
		l4.name="Tamil";""|||||"
		
		Language l5=new Language();
		l5.name="English";
		
		Language l6=new Language();
		l6.name="Malayalam";
		
		Language l7=new Language();
		l7.name="Marathi";
		
		Language l8=new Language();
		l8.name="Gujarati";
		
		Language l9=new Language();
		l9.name="Punjabi";
		
		Language l10=new Language();
		l10.name="Bengali";
		
		Language l11=new Language();
		l11.name="Urdu";
		
		Language l12=new Language();
		l12.name="Sanskrit";
		
		Language l13=new Language();
		l13.name="Spanish";
		
		Language l14=new Language();
		l14.name="French";
		
		Language l15=new Language();
		l15.name="German";
		
		Language language[]=new Language[15];
		language[0]=l1;
		language[1]=l2;
		language[2]=l3;
		language[3]=l4;
		language[4]=l5;
		language[5]=l6;
		language[6]=l7;
		language[7]=l8;
		language[8]=l9;
		language[9]=l10;
		language[10]=l11;
		language[11]=l12;
		language[12]=l13;
		language[13]=l14;
		language[14]=l15;
		
		for(Language lang:language)
			System.out.println(lang.name);
	}
}


