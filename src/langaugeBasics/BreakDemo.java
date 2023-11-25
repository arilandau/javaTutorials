package langaugeBasics;

public class BreakDemo
{
	public static void main( String[] args )
	{
		int[] arrayOfInts =
		{ 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		int searchFor = 12;

		findInt( arrayOfInts, searchFor );
	}

	public static void findInt( int[] arrayOfInts, int intToFind )
	{
		int i;
		boolean foundIt = false;

		for ( i = 0; i < arrayOfInts.length; i++ )
			if ( arrayOfInts[i] == intToFind )
			{
				foundIt = true;
				break;
			}

		if ( foundIt )
		{
			System.out.println( "Found " + intToFind + " at index " + i );
		}
		else
		{
			System.out.println( "Your number doesn't exist in the array." );
		}
	}
}
