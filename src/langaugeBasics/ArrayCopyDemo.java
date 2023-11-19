package langaugeBasics;

public class ArrayCopyDemo
{
	public static void main(String[] args)
	{
		String[] copyFrom = {
			"Affogato", 
			"Americano", 
			"Cappuccino", 
			"Corretto", 
			"Cortado",   
	        "Doppio", 
	        "Espresso", 
	        "Frappucino", 
	        "Freddo", 
	        "Lungo", 
	        "Macchiato",      
	        "Marocchino", 
	        "Ristretto"
		};
		
		String[] copyTo = new String[7];
		System.arraycopy( copyFrom, 4, copyTo, 0, 7 );
		
		for ( String coffee : copyTo )
			System.out.println( "Coffee: " + coffee );

		String[] copyOfRange = java.util.Arrays.copyOfRange( copyFrom, 2, 9 );

		for ( String coffee : copyOfRange )
			System.out.println( "More coffee: " + coffee );
	}
}
