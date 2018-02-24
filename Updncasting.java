class  Vehicle
{
	void show()
	{
		System.out.println("In Vehicle");
	}
}

class  Car extends Vehicle
{
	void show()
	{
		System.out.println("In Car");
	}
}

class  BMW extends Car
{
	void show()
	{
		System.out.println("In BMW");
	}
}

class  Bus extends Vehicle
{
	void show()
	{
		System.out.println("In Bus");
	}
}

class UpdnCasting
{
	public static void main(String args[])
	{
		Vehicle v1 = new Car();
		v1.show();

		Vehicle v2 = new Vehicle();
		v2.show();
		
		//Car c1 = v1;
		 Car c1 = (Car) v1;
		c1.show();
		
		// Car c2 = (Car) v2;
		//Car b1 = new BMW();
		
		Car c3 = new BMW();
		c3.show();

		//Car c4 = (BMW) v1;

		Object o = v1;
		Car c5 = (Car) v1;

		Car c8 =(Car)v1;
		c8.show();
	}
}