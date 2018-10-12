package edu.uwex.apc390.lesson8_5;

import java.util.List;
import java.util.LinkedList;

public class MainLinkedList {

	public static void main(String[] args) {
		List<String> lList1 = new LinkedList<>();
		lList1.add( "Hello" );
		lList1.add( "Bon jour" );
		System.out.println( "String  LinkedList: " + lList1 );
		
		List<Integer> lList2 = new LinkedList<>();
		lList2.add( 102 );
		lList2.add( -27 );
		// will not work: al2.remove( 102 );
		Integer n = 102;
		lList2.remove( n );
		System.out.println( "\n\nInteger LinkedList: " + lList2 );
		// Remove item by index:
		int index = 0;
		Integer removed = lList2.remove( index );
		System.out.println( " Request to remove item by index: " + index + " yielded: " + removed );
		System.out.println( "Integer ArrayList: " + lList2 + " is empty? " + lList2.isEmpty() );
		
		List<Double> lList3 = new LinkedList<>();
		lList3.add( -23.5 );
		lList3.add( 133.774 );
		System.out.println( "\n\nDouble  LinkedList: " + lList3 );
		lList3.remove( -23.5 );
		System.out.println( lList3 + " isEmpty: " + lList3.isEmpty() );
		
		List<Person> lList4 = new LinkedList<>();
		lList4.add( new Person("Dave", "Milwaukee") );
		lList4.add( new Person("Devi", "Platteville") );
		System.out.println("Person  LinkedList: " + lList4);
	}

}
