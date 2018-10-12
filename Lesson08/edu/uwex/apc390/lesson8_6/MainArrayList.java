package edu.uwex.apc390.lesson8_6;

import java.util.List;
import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {
		List<String> arrlst = new ArrayList<>();
		arrlst.add( "Hello" );
		arrlst.add( "Bon jour" );
		arrlst.add( "Ohayo gozaimasu" );
		// Remove item by index: will not work: hset.remove( 0 );
		System.out.println( "String LinkedHashSet: " + arrlst );

		// Add a duplicate
		String hello = "Hello";
		arrlst.add( hello );
		System.out.println( " added " + hello + " to Set --> " + arrlst );
		// Remove "Hello"
		boolean b = arrlst.remove( hello );
		System.out.println( " Request to remove the " + hello + " String successful? " + b );
		System.out.println( "\nSet is now: " + arrlst );
		
		// Add it back
		arrlst.add( hello );
		System.out.println( " added " + hello + " to Set --> " + arrlst );
	}
}
