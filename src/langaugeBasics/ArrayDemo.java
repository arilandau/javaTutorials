package langaugeBasics;

import java.util.Arrays;

public class ArrayDemo
{
	public static void main(String[] args)
	{
		// assigning arrays
		int[] anArray;
		anArray = new int[10];
		
		anArray[0] = 100;
		anArray[1] = 200;
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray[9] = 1000;
		
		System.out.println("Element at index 0: " + anArray[0]);
		System.out.println("Element at index 1: " + anArray[1]);
		System.out.println("Element at index 2: " + anArray[2]);
		System.out.println("Element at index 3: " + anArray[3]);
		System.out.println("Element at index 4: " + anArray[4]);
		System.out.println("Element at index 5: " + anArray[5]);
		System.out.println("Element at index 6: " + anArray[6]);
		System.out.println("Element at index 7: " + anArray[7]);
		System.out.println("Element at index 8: " + anArray[8]);
		System.out.println("Element at index 9: " + anArray[9]);
	
		int[] anotherArray;
		byte[] anArrayOfBytes;
		short[] anArrayOfShorts;
		long[] anArrayOfLongs;
		float[] anArrayOfFloats;
		double[] anArrayOfDoubles;
		boolean[] anArrayOfBooleans;
		char[] anArrayOfChars;
		String[] anArrayOfStrings;
	
		int[] yetAnotherArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

		System.out.println("Yet another element at index 0: " + yetAnotherArray[0]);
		System.out.println("Yet another element at index 1: " + yetAnotherArray[1]);
		System.out.println("Yet another element at index 2: " + yetAnotherArray[2]);
		System.out.println("Yet another element at index 3: " + yetAnotherArray[3]);
		System.out.println("Yet another element at index 4: " + yetAnotherArray[4]);
		System.out.println("Yet another element at index 5: " + yetAnotherArray[5]);
		System.out.println("Yet another element at index 6: " + yetAnotherArray[6]);
		System.out.println("Yet another element at index 7: " + yetAnotherArray[7]);
		System.out.println("Yet another element at index 8: " + yetAnotherArray[8]);
		System.out.println("Yet another element at index 9: " + yetAnotherArray[9]);		
	
		// binary search
		int[] intArray = { 11, 14, 16, 24, 25 };

		System.out.println( "25 found at: " + Arrays.binarySearch( intArray, 25 ) );
	
        // equals
		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 1, 2, 3, 4 };
		int[] array3 = { 1, 2, 4, 3 };
		
		System.out.println( Arrays.equals( array1, array2 ) );
		System.out.println( Arrays.equals( array2, array3 ) );
	
		// fill
		int[] arrayOf10s = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Arrays.fill( arrayOf10s, 10 );
		
		for ( int ten : arrayOf10s )
			System.out.println( ten );
	
		// sort
		int[] arrayToSort = { 1, 54, 5, 25, 6, 57, 90, 2, 94 };
		
		System.out.println( "Unsorted: ");
		
		for ( int num : arrayToSort )
			System.out.println( num );
		
		Arrays.sort( arrayToSort );
		
		System.out.println( "Sorted: " );
		
		for ( int num : arrayToSort )
			System.out.println( num );
	
		// stream
		String[] arrayOfCoffees = {
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
		
		Arrays.stream( arrayOfCoffees ).map( coffee -> coffee + " ").forEach( System.out::println );
	
		// to String
		System.out.println( Arrays.toString( arrayOfCoffees ) );
	}
}
