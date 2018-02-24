class GM<T,V>
{
	//T t,V v;
	public void show(T t, V v)
	{
		T t1=t;
		V v1=v;
		
		System.out.println("T "+t1+"    V = "+v1);
	}
}
class GenericDemo
{
	public static void main(String args[])
	{
		GM<Integer,String> gm = new	GM<Integer,String>();		
		gm.show(10,"abc");

	}
}