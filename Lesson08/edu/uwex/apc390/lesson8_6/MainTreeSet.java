package edu.uwex.apc390.lesson8_6;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {

	public static void main(String[] args) {
		Set<String> tset = new TreeSet<>();
		tset.add( "Hello" );
		tset.add( "Bon jour" );
		tset.add( "Ohayo gozaimasu" );
		// Remove item by index: will not work: hset.remove( 0 );
		System.out.println( "String TreeSet: " + tset );

		// Add a duplicate
		String hello = "Hello";
		tset.add( hello );
		System.out.println( " added " + hello + " to Set --> " + tset );
		// Remove "Hello"
		boolean b = tset.remove( hello );
		System.out.println( " Request to remove the " + hello + " String successful? " + b );
		System.out.println( "\nSet is now: " + tset );
		
		// Add it back
		tset.add( hello );
		System.out.println( " added " + hello + " to Set --> " + tset );
		
		Set<Person> hsetp = new TreeSet<>();
		hsetp.add( new Person("Devi", "Platteville") );
		hsetp.add( new Person("Dave", "Milwaukee") );
		hsetp.add( new Person("Diego", "Manitowoc") );
		System.out.println("\n\nPerson TreeSet has: " + hsetp);
	}

}
