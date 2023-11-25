package langaugeBasics;

public class ContinueDemo
{
	public static void main( String[] args )
	{
		String searchMe = "peter piper picked a peck of pickled peppers";
		findPs( searchMe );
		
		String searchMeToo = "the quick brown fox jumped over the lazy log";
		findPs( searchMeToo );
	}

	private static void findPs( String searchMe )
	{
		int numberOfPs = 0;
		
		for( int i = 0; i < searchMe.length(); i++ )
		{
			if ( searchMe.charAt( i ) != 'p' )
				continue;
			
			numberOfPs++;
		}
		
		String phrase = numberOfPs == 1 ? "P" : "P's";
		
		System.out.println( "Found " + numberOfPs + " " + phrase + " in your sentence." );
	}
}
