package classesAndObjects;

public class Bicycle
{
	public int cadence;
	public int speed;
	public int gear;

	public Bicycle( int startCadence, int startSpeed, int startGear )
	{
		cadence = startCadence;
		speed = startSpeed;
		gear = startGear;
	}

	public void setSpeed( int newSpeed )
	{
		speed = newSpeed;
	}

	public void setGear( int newGear )
	{
		gear = newGear;
	}

	public void applyBrake( int decrement )
	{
		speed -= decrement;
	}

	public void speedUp( int increment )
	{
		speed += increment;
	}
}
