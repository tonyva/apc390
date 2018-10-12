package edu.uwex.apc390.lesson8_3;

import java.util.ArrayList;

public class MainArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add( "Hello" );
		al1.add( "Bon jour" );
		System.out.println( "String  ArrayList: " + al1 );
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add( 102 );
		al2.add( -27 );
		System.out.println( "\n\nInteger ArrayList: " + al2 );
		// will not work: al2.remove( 102 );
		Integer n = 102;
		boolean b = al2.remove( n );
		System.out.println(" Request to remove item " + n + " successful? " + b);
		// Remove item by index:
		int index = 0;
		Integer removed = al2.remove( index );
		System.out.println( " Request to remove item by index: " + index + " yielded: " + removed );
		System.out.println( "Integer ArrayList: " + al2 + " is empty? " + al2.isEmpty() );
		
		ArrayList<Double> al3 = new ArrayList<>();
		al3.add( -23.5 );
		al3.add( 133.774 );
		System.out.println( "\n\nDouble  ArrayList: " + al3 );
		al3.remove( -23.5 );
		System.out.println( al3 + " isEmpty: " + al3.isEmpty() );
		
	}

}
