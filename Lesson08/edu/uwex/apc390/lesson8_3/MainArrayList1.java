package edu.uwex.apc390.lesson8_3;

import java.util.ArrayList;

public class MainArrayList1 {

	public static void main(String[] args) {
		// Do not use ArrayList this way - it is not safe.
		ArrayList al = new ArrayList();
		al.add( "Hello" );
		al.add( 102 );
		al.add( -23.5 );
		System.out.println( al + " isEmpty: " + al.isEmpty() );
		System.out.println("\nRemoving elements ...");
		// Note that we cannot treat String and Integer objects the same way!
		if ( al.contains( "Hello" ) )
			al.remove( "Hello" );
		if ( al.contains( 102 ) )
			al.remove( al.get( al.indexOf( 102 ) ) );
		int index = 0;
		Object x = al.remove( index );
		if (x != null)
			System.out.println("Removed item at index: " + index + " --> " + x);
		System.out.println( "ArrayList: " + al + " isEmpty: " + al.isEmpty() );
	}
}
