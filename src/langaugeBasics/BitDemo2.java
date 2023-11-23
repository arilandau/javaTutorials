package langaugeBasics;

public class BitDemo2
{
	public static void main( String[] args )
	{
		int five = 5;
		int seven = 7;
		int fiveAndSeven = 5 & 7;
		int fiveOrSeven = 5 | 7;
		int fiveXorSeven = 5 ^ 7;
		int fiveComplement = ~5;
		int fiveShiftLeft = 5 << 1;
		int fiveShiftRight = 5 >> 1;

		System.out.println( "Five in bits: " + Integer.toBinaryString( five ) );
		System.out.println( "Seven in bits: " + Integer.toBinaryString( seven ) );
		System.out.println( "Five & seven: " + fiveAndSeven );
		System.out.println( "Five & seven in bits: " + Integer.toBinaryString( fiveAndSeven ) );
		System.out.println( "Five | seven: " + fiveOrSeven );
		System.out.println( "Five | seven in bits: " + Integer.toBinaryString( fiveOrSeven ) );
		System.out.println( "Five ^ seven: " + fiveXorSeven );
		System.out.println( "Five ^ seven in bits: " + Integer.toBinaryString( fiveXorSeven ) );
		System.out.println( "Five complement: " + fiveComplement );
		System.out.println( "Five complement in bits: " + Integer.toBinaryString( fiveComplement ) );
		System.out.println( "Five shifted left: " + fiveShiftLeft );
		System.out.println( "Five shifted left in bits: " + Integer.toBinaryString( fiveShiftLeft ) );
		System.out.println( "Five shifted right: " + fiveShiftRight );
		System.out.println( "Five shifted right in bits: " + Integer.toBinaryString( fiveShiftRight ) );
		
		five &= seven;

		System.out.println( "Still five: " + five );
		System.out.println( "Still five in bits: " + Integer.toBinaryString( five ) );
	}
}
