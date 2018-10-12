package edu.uwex.apc390.lesson8_6;

import java.util.Set;
import java.util.HashSet;

public class MainHashSet {

	public static void main(String[] args) {
		Set<String> hset = new HashSet<>();
		hset.add( "Hello" );
		hset.add( "Bon jour" );
		hset.add( "Ohayo gozaimasu" );
		// Remove item by index: will not work: hset.remove( 0 );
		System.out.println( "String HashSet: " + hset );

		// Add a duplicate
		String hello = "Hello";
		hset.add( hello );
		System.out.println( " added " + hello + " to Set --> " + hset );
		// Remove "Hello"
		boolean b = hset.remove( hello );
		System.out.println( " Request to remove the " + hello + " String successful? " + b );
		System.out.println( "\nSet is now: " + hset );
		
		// Add it back
		hset.add( hello );
		System.out.println( " added " + hello + " to Set --> " + hset );
		
		Set<Person> hsetp = new HashSet<>();
		hsetp.add( new Person("Devi", "Platteville") );
		hsetp.add( new Person("Dave", "Milwaukee") );
		hsetp.add( new Person("Diego", "Manitowoc") );
		System.out.println("\n\nPerson HashSet has: " + hsetp);
	}

}
