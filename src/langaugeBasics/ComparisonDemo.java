package langaugeBasics;

public class ComparisonDemo
{
	public static void main( String[] args )
	{
		compare( 1, 1 );
		compare( 1, 2 );
		compare( 2, 1 );
	}

	private static void compare( int value1, int value2 )
	{
		if ( value1 == value2 )
			System.out.println( "value1 == value2" );

		if ( value1 != value2 )
			System.out.println( "value1 != value2" );

		if ( value1 > value2 )
			System.out.println( "value1 > value2" );

		if ( value1 < value2 )
			System.out.println( "value1 < value2" );

		if ( value1 <= value2 )
			System.out.println( "value1 <= value2" );
	}
}
