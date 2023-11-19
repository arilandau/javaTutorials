package oopConcepts;

public class BikeDemo
{
	public static void main( String[] args )
	{
		ACMEBike bike1 = new ACMEBike();
		ACMEBike bike2 = new ACMEBike();

		bike1.changeCadence( 50 );
		bike1.speedUp( 10 );
		bike1.changeGear( 2 );
		bike1.printStates();
		
		bike2.changeCadence( 50 );
		bike2.speedUp( 10 );
		bike2.changeGear( 2 );
		bike2.changeCadence( 40 );
		bike2.speedUp( 10 );
		bike2.changeGear( 3 );
		bike2.printStates();
	}
}