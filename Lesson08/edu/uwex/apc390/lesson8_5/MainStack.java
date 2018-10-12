package edu.uwex.apc390.lesson8_5;

import java.util.List;
import java.util.Stack;

public class MainStack {

	public static void main(String[] args) {
		List<String> stack1 = new Stack<>();
		stack1.add( "Hello" );
		stack1.add( "Bon jour" );
		System.out.println( "String  Vector: " + stack1 );
		
		List<Integer> stack2 = new Stack<>();
		stack2.add( 102 );
		stack2.add( -27 );
		System.out.println( "\n\nInteger Stack: " +stack2 );
		// will not work: al2.remove( 102 );
		Integer n = 102;
		stack2.remove( n );
		System.out.println( "Integer Stack: " + stack2 );
		// Remove item by index:
		int index = 0;
		Integer removed = stack2.remove( index );
		System.out.println( " Request to remove item by index: " + index + " yielded: " + removed );
		System.out.println( "Integer ArrayList: " + stack2 + " is empty? " + stack2.isEmpty() );
		
		List<Double> stack3 = new Stack<>();
		stack3.add( -23.5 );
		stack3.add( 133.774 );
		System.out.println( "\n\nDouble  Stack: " +stack3 );
		if ( stack3.contains( -23.5 ) )
			stack3.remove( stack3.get( stack3.indexOf( -23.5 ) ) );
		System.out.println( stack3 + " isEmpty: " + stack3.isEmpty() );

		List<Person> al4 = new Stack<>();
		al4.add( new Person("Dave", "Milwaukee") );
		al4.add( new Person("Devi", "Platteville") );
		System.out.println("Person  Stack: " + al4);
	}

}
