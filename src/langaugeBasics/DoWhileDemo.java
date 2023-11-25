package langaugeBasics;

public class DoWhileDemo
{
	public static void main( String[] args )
	{
		int count = 1;
		
		do
		{
			System.out.println( "Your count is: " + count );
			count++;
		} while ( count < 11 );
	}
}
