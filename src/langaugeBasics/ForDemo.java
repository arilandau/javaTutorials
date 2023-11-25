package langaugeBasics;

public class ForDemo
{
	public static void main( String[] args )
	{
		for ( int i = 1; i < 11; i++ )
			System.out.println( "Your count is: " + i );

		int[] numbers =
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for ( int number : numbers )
			System.out.println( "Your enhanced count is: " + number );
	}
}
