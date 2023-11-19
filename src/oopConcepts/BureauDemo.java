package oopConcepts;

public class BureauDemo
{
	public static void main(String[] args)
	{
		Bureau bureau = new Bureau();
		
		bureau.printStates();
		bureau.openDrawer( 1 );
		bureau.printStates();
		bureau.closeAllDrawers();
		bureau.printStates();
		bureau.openAllDrawers();
		bureau.printStates();
	}
}
