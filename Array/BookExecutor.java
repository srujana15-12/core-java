class BookExecutor
{
	public static void main(String[] b)
	{
		Book b1=new Book();
		b1.bookName="Science";
		
		Book b2=new Book();
		b2.bookName="Mathematics";
		
		Book b3=new Book();
		b3.bookName="Social Science";
		
		Book b4=new Book();
		b4.bookName="Sanskrit";
		
		Book b5=new Book();
		b5.bookName="English";
		
		Book b6=new Book();
		b6.bookName="Kannada";
		
		Book b7=new Book();
		b7.bookName="Java";
		
		Book b8=new Book();
		b8.bookName="Data Structures";
		
		Book b9=new Book();
		b9.bookName="Database Management System";
		
		Book b10=new Book();
		b10.bookName="Computer Networks";
		
		Book b11=new Book();
		b11.bookName="Web development";
		
		Book b12=new Book();
		b12.bookName="Software Engineering";
		
		Book b13=new Book();
		b13.bookName="Machine Learning";
		
		Book b14=new Book();
		b14.bookName="Artificial Intelligence";
		
		Book b15=new Book();
		b15.bookName="Operating System";
		
		Book books[]=new Book[15];
		
		books[0]=b1;
		books[1]=b2;
		books[2]=b3;
		books[3]=b4;
		books[4]=b5;
		books[5]=b6;
		books[6]=b7;
		books[7]=b8;
		books[8]=b9;
		books[9]=b10;
		books[10]=b11;
		books[11]=b12;
		books[12]=b13;
		books[13]=b14;
		books[14]=b15;
		
		for(Book book:books)
			System.out.println(book.bookName);
	}
}