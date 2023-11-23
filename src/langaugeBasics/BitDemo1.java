package langaugeBasics;

public class BitDemo1
{
	public static void main( String[] args )
	{
		int value = 0x2222;
		int bitMask = 0x000F;

		System.out.println( value & bitMask );

		int zeroInt = 000000;
		int flippedInt;

		flippedInt = ~zeroInt;

		System.out.println( zeroInt );
		System.out.println( Integer.toBinaryString( zeroInt ) );
		System.out.println( flippedInt );
		System.out.println( Integer.toBinaryString( flippedInt ) );
		
		byte zeroByte = 000000;
		byte flippedByte;
		
		flippedByte = (byte) ~zeroByte;
		
		System.out.println( zeroByte );
		System.out.println( Integer.toBinaryString( zeroByte ) );
		System.out.println( flippedByte );
		System.out.println( Integer.toBinaryString( flippedByte ) );
	}
}
