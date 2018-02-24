import java.io.*;


class ExceptionTen
{	public static void main(String args[]){
	int a=100,b=0,c,k;
	String s = "abcdefghij";
	FileInputStream fis = null;
	int d[] = new int[5];
	try
	{
		c=a/b; 		
	}

	catch(ArithmeticException ae)
	{
		System.out.println("Exception Caught: "+ae);
	}

	try
	{	
		s=null;
		System.out.println("Length of String : "+s.length());
	}

	catch(NullPointerException npe)
	{
		System.out.println("Exception Caught: "+npe);
	}

	try
	{	
		int i = Integer.parseInt(s);
		System.out.println("Number Entered is : "+i);
	}

	catch(NumberFormatException nfe)
	{
		System.out.println("Exception Caught: "+nfe);
	}
	try
	{	
		d[10]=15;
		System.out.println(d[10]);
	}

	catch(ArrayIndexOutOfBoundsException aie)
	{
		System.out.println("Exception Caught: "+aie);
	}
	try
	{	
		String s1 = "Somnath";
		char p=s1.charAt(30);
		System.out.println(p);
	}

	catch(StringIndexOutOfBoundsException sie)
	{
		System.out.println("Exception Caught: "+sie);
	}

	
	try
	{	
		fis = new FileInputStream("abc.txt");
	}

	catch(FileNotFoundException fofe)
	{
		System.out.println("Exception Caught: "+fofe);
	}

	try
	{	while((k=fis.read())!=-1)
		{
			System.out.println((char) k); 
		}
		fis.close();
	}

	catch(IOException ioe)
	{
		System.out.println("Exception Caught: "+ioe);
	}
}

}