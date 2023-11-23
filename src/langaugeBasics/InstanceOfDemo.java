package langaugeBasics;

public class InstanceOfDemo
{
	public static void main( String[] args )
	{
		Parent mommy = new Parent();
		Parent mickey = new Child();

		System.out.println( "Mommy instance of Parent: " + (mommy instanceof Parent) );
		System.out.println( "Mommy instance of Child: " + (mommy instanceof Child) );
		System.out.println( "Mommy instance of MyInterface: " + (mommy instanceof MyInterface) );
		System.out.println( "Mickey instance of Parent: " + (mickey instanceof Parent) );
		System.out.println( "Mickey instance of Child: " + (mickey instanceof Child) );
		System.out.println( "Mickey instance of MyInterface: " + (mickey instanceof MyInterface) );
	
		Parent nullParent = null;
		Child nullChild = null;
		
		System.out.println( "NullParent instance of Parent: " + (nullParent instanceof Parent) );
		System.out.println( "NullParent instance of Child: " + (nullParent instanceof Child) );
		System.out.println( "NullParent instance of MyInterface: " + (nullParent instanceof MyInterface) );
		System.out.println( "NullChild instance of Parent: " + (nullChild instanceof Parent) );
		System.out.println( "NullChild instance of Child: " + (nullChild instanceof Child) );
		System.out.println( "NullChild instance of MyInterface: " + (nullChild instanceof MyInterface) );
	}
}

class Parent {}

class Child extends Parent implements MyInterface {}

interface MyInterface {}
