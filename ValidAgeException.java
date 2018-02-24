class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}

class ValidAgeException
{
	static void validate(int age) throws InvalidAgeException
	{
		if(age<18&&age>0)
			throw new InvalidAgeException("Sorry. You are a minor, can not vote...");
		if(age<0||age>200)
			System.out.println("Please enter a valid age.");
		else 
			System.out.println("You can Vote.");
	}

	public static void main(String[] args) 
	{
		try
		{
			validate(21);
		}

		catch(Exception e)
		{
			System.out.println("Exception Caught: "+e);
		}	
	}

}