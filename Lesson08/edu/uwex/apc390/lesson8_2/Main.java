package edu.uwex.apc390.lesson8_2;

public class Main {

	public static void main(String[] args) {
		IntegerPair p1 = new IntegerPair( 20, -12);
		System.out.println("IntegerPair p1 is: " + p1 );
		
		GenericPair<Integer> p2 = new GenericPair<Integer>( 100, 21 );
		System.out.println("GenericPair of Integer p2 is: " + p2 );

		GenericPair<Float> p3 = new GenericPair<>( 10.1f, -12.3f );
		System.out.println("GenericPair of Float p3 is: " + p3 );

		GenericPair<String> p4 = new GenericPair<>( "Hello", "there." );
		System.out.println("GenericPair of String p4 is: " + p4 );

		GenericPair<Person> p5 = new GenericPair<>( new Person("Jane", "Madison"), new Person("Jake","River Falls") );
		System.out.println("GenericPair of Person p5 is: " + p5 );
	}
}
