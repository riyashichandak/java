 class Sum
{
	int a,b,c;
 
	void Add()
	{
		a=5;
		b=7;
		c=a+b;

	}

	void Show()
	{
		System.out.println("the value of c is :"+c);

	}

}


class Summation
{
	public static void main(String args[])
	{
		Sum s = new Sum();
		s.Add();
		s.Show();
		
	
	}
}