public class BeerSong
{
	public static void main(String args[])
	{
		int beerNum=99;
		String word = "bottles";
		
		while (beerNum >0)
		{

			System.out.println(beerNum + "  " + word + " of beer on the wall ") ;
  			System.out.println(beerNum + "  " + word + " of beer.");
			System.out.println("Take one down. ") ;
			System .out .println( "Pass it around. ") ;
	
			beerNum = beerNum - 1;

			if(beerNum>0)
			{
			System.out .println(beerNum + " " + word + " of beer on the wall.\n ") ;
			}
			else
			{
			System.out.println("\nNo more bottles of beer on the wall.\n") ;	
			}
	
		}
	}

}