package langaugeBasics;

public class StringSwitchDemo
{
	public static int getMonthNumber( String monthName )
	{
		int monthNumber = 0;
		
		if ( monthName == null )
			return monthNumber;

		switch ( monthName.toLowerCase() )
		{
		case "january":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		case "april":
			monthNumber = 4;
			break;
		case "may":
			monthNumber = 5;
		case "june":
			monthNumber = 6;
			break;
		case "july":
			monthNumber = 7;
			break;
		case "august":
			monthNumber = 8;
			break;
		case "september":
			monthNumber = 9;
			break;
		case "october":
			monthNumber = 10;
			break;
		case "november":
			monthNumber = 11;
			break;
		case "december":
			monthNumber = 12;
			break;
		}

		return monthNumber;
	}

	public static void main( String[] args )
	{
		String monthName = "August";

		int returnedMonthNumber = getMonthNumber( monthName );

		if ( returnedMonthNumber == 0 )
			System.out.println( "Invalid month name." );
		else
		{
			System.out.println( "Your month number is: " + returnedMonthNumber );
		}
	}
}
