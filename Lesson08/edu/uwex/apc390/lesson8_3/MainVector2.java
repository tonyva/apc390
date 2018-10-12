package edu.uwex.apc390.lesson8_3;

import java.util.Vector;

public class MainVector2 {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
		v1.add( "Hello" );
		v1.add( "Bon jour" );
		System.out.println( "String  Vector: " + v1 );
		
		Vector<Integer> v2 = new Vector<>();
		v2.add( 102 );
		v2.add( -27 );
		System.out.println( "Integer Vector: " +v2 );
		
		Vector<Double> v3 = new Vector<>();
		v3.add( -23.5 );
		v3.add( 133.774 );
		System.out.println( "Double  Vector: " +v3 );
		if ( v3.contains( -23.5 ) )
			v3.remove( v3.get( v3.indexOf( -23.5 ) ) );
		System.out.println( v3 + " isEmpty: " + v3.isEmpty() );
		
	}

}
