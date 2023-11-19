package oopConcepts;

import java.util.HashMap;

public class Bureau implements Drawers
{
	HashMap<Integer, String> drawers = new HashMap<>();

	public Bureau()
	{
		drawers.put( 1, "shut" );
		drawers.put( 2, "shut" );
		drawers.put( 3, "shut" );
		drawers.put( 4, "shut" );
	}

	@Override
	public void openDrawer( int drawerNumber )
	{
		drawers.put( drawerNumber, "open" );
	}

	@Override
	public void openAllDrawers()
	{
		drawers.replaceAll( ( key, value ) -> value = "open" );
	}

	@Override
	public void closeDrawer( int drawerNumber )
	{
		drawers.put( drawerNumber, "shut" );
	}

	@Override
	public void closeAllDrawers()
	{
		drawers.replaceAll( ( key, value ) -> value = "shut" );
	}

	void printStates()
	{
		drawers.forEach( (key, value) -> System.out.println("Drawer #" + key + " is " + value) );
	}
}
