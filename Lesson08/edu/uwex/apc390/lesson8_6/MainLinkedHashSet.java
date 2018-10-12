package edu.uwex.apc390.lesson8_6;

import java.util.Set;
import java.util.LinkedHashSet;

public class MainLinkedHashSet {

	public static void main(String[] args) {
		Set<String> lhset = new LinkedHashSet<>();
		lhset.add( "Hello" );
		lhset.add( "Bon jour" );
		lhset.add( "Ohayo gozaimasu" );
		// Remove item by index: will not work: hset.remove( 0 );
		System.out.println( "String LinkedHashSet: " + lhset );

		// Add a duplicate
		String hello = "Hello";
		lhset.add( hello );
		System.out.println( " added " + hello + " to Set --> " + lhset );
		// Remove "Hello"
		boolean b = lhset.remove( hello );
		System.out.println( " Request to remove the " + hello + " String successful? " + b );
		System.out.println( "\nSet is now: " + lhset );
		
		// Add it back
		lhset.add( hello );
		System.out.println( " added " + hello + " to Set --> " + lhset );
		
		Set<Person> hsetp = new LinkedHashSet<>();
		hsetp.add( new Person("Devi", "Platteville") );
		hsetp.add( new Person("Dave", "Milwaukee") );
		hsetp.add( new Person("Diego", "Manitowoc") );
		System.out.println("\n\nPerson LinkedHashSet has: " + hsetp);
	}

}
