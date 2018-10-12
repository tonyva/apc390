package edu.uwex.apc390.lesson8_4;

import java.util.List;
import java.util.ArrayList;

public class MainArrayList3 {

	public static void main(String[] args) {
		List<String> al1 = new ArrayList<>();
		al1.add( "Hello" );
		al1.add( "Bon jour" );
		System.out.println( "String  ArrayList: " + al1 );
		
		List<Integer> al2 = new ArrayList<>();
		al2.add( 102 );
		al2.add( -27 );
		// will not work: al2.remove( 102 );
		Integer n = 102;
		al2.remove( n );
		System.out.println( "\n\nInteger ArrayList: " + al2 );
		// Remove item by index:
		int index = 0;
		Integer removed = al2.remove( index );
		System.out.println( " Request to remove item by index: " + index + " yielded: " + removed );
		System.out.println( "Integer ArrayList: " + al2 + " is empty? " + al2.isEmpty() );
		
		List<Double> al3 = new ArrayList<>();
		al3.add( -23.5 );
		al3.add( 133.774 );
		System.out.println( "\n\nDouble  ArrayList: " + al3 );
		al3.remove( -23.5 );
		System.out.println( al3 + " isEmpty: " + al3.isEmpty() );
		
		List<Person> al4 = new ArrayList<>();
		al4.add( new Person("Dave", "Milwaukee") );
		al4.add( new Person("Devi", "Platteville") );
		System.out.println("Person  ArrayList: " + al4);
	}

}
