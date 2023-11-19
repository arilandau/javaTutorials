package langaugeBasics;

public class MultiDimensionalArrayDemo
{
	public static void main( String[] args )
	{
		String[][] names =
		{
				{ "Mr.", "Mrs.", "Ms." },
				{ "Smith", "Landau" }
		};

		System.out.println( "Mr. Smith: " + names[0][0] + " " + names[1][0] );
		System.out.println( "Mrs. Landau: " + names[0][1] + " " + names[1][1] );
	
		System.out.println( "Outer array length: " + names.length );
		System.out.println( "First inner array length: " + names[0].length );
		System.out.println( "Second inner array length: " + names[1].length );
	}
}
