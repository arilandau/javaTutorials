package langaugeBasics;

public class Literals
{
	public static void main( String[] args )
	{
		// literals		
		boolean result = true;
		char capitalC = 'C';
		byte b = 100;
		short s = 10000;
		int i = 100000;

		// integer literals
		int decVal = 26;
		int hexVal = 0x1a;
		int binVal = 0b11010;

		// floating-point literals
		double d1 = 123.4;
		double d2 = 1.234e2;
		float f1 = 123.4f;

		// string literals
		String backspace = "This is what a \b backspace looks like";
		System.out.println( backspace );

		String tab = "This is what a \t tab looks like";
		System.out.println( tab );

		String lineFeed = "This is what a \n line feed looks like";
		System.out.println( lineFeed );
	
		String formFeed = "This is what a \f form feed looks like";
		System.out.println( formFeed );
		
		String doubleQuotes = "This is what \" double quotes look like";
		System.out.println( doubleQuotes );
		
		String singleQuotes = "This is what \' single quotes look like";
		System.out.println( singleQuotes );
		
		String backslash = "This is what a \\ backslash looks like";
		System.out.println( backslash );
		
		// underscores in numeric literals
		long creditCardNumber = 1234_5678_9012_3456L;
		System.out.println( creditCardNumber );
		
		long socialSecurityNumber = 999_99_9999L;
		System.out.println( socialSecurityNumber );
		
		float pi = 3.14_15F;
		System.out.println( pi );
		
		long hexBytes = 0xFF_EC_DE_5E;
		System.out.println( hexBytes );
		
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		System.out.println( maxLong );
		
		byte nybbles = 0b0010_0101;
		System.out.println( nybbles );
	
		long bytes = 0b11010010_01101001_10010100_10010010;
		System.out.println( bytes );
	}
}
