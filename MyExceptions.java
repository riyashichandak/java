import java.lang.Math;

class MyExe extends Exception 
{
	protected String msg;
	public MyExe(String msg)
	{
		this.msg = msg;
	}
	public String getMsg()
	{return msg;}
}

class MyExceptions 
{
	public static void main(String args[])
	{
		int num = 0;
		num = Integer.parseInt(args[0]);
		try
		{
			if(num>10)
			{
				MyExe me = new MyExe("The number entered is greater than allowed.");
				throw me;
			}
			else
				System.out.println("The power is : "+ Math.pow(num,2));	

		}

		catch(Exception me)
		{
			System.out.println("Exception caught :"+me);
		}


	}

}
