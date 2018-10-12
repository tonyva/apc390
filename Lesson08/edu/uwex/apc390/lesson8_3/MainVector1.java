package edu.uwex.apc390.lesson8_3;

import java.util.Vector;

public class MainVector1 {

	public static void main(String[] args) {
		// Do not use Vector this way - it is not safe.
		Vector v = new Vector();
		v.add( "Hello" );
		v.add( 102 );
		v.add( -23.5 );
		System.out.println( v + " isEmpty: " + v.isEmpty());
		System.out.println("\nRemoving elements ...");
		// Note that we cannot treat String and Integer objects the same way!
		if ( v.contains( "Hello" ) )
			v.remove( "Hello" );
		if ( v.contains( 102 ) )
			v.remove( v.get( v.indexOf( 102 ) ) );
		System.out.println( v + " isEmpty: " + v.isEmpty() );
	}
}
