import java.io.*;
class MySerial implements Serializable
{
	String s; int i; float f;
	MySerial(String s, int i, float f)
	{
		this.s  = s;
		this.i  = i;
		this.f  = f;
	}

	public String toString()
	{return "s= "+s+"i= "+i+"f= "+f ;}
	
}

class SerialDemo
{
	public static void main(String s[])
	{
		try
		{
			MySerial ms = new MySerial("Hello",2.14f);
			System.out.println("ms= "+ms);
		}
	}
}