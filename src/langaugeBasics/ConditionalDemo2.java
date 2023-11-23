package langaugeBasics;

public class ConditionalDemo2
{
	public static void main( String[] args )
	{
		int value1 = 1;
		int value2 = 2;
		int result;
		int result2;
		int result3;
		
		boolean someCondition = true;
		result = someCondition ? value1 : value2;
		System.out.println( "Result: " + result );

		boolean anotherCondition = false;
		result2 = anotherCondition ? value1 : value2;
		System.out.println( "Result2: " + result2 );
		
        // NullPointerException		
		Boolean nullCondition = null;
		result3 = nullCondition ? value1 : value2;
		System.out.println( "Result3: " + result3 );
	}
}
