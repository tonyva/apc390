package edu.uwex.apc390.lesson8_1;

public class Main {

	public static void main(String[] args) {
		/*
		 * Test out the various methods in the IntegerList class:
		 */
		IntegerList ilist = new IntegerList(); // Constructor
		for (int i=0; i<10; i++) {
			int r = (int) ( 1000 * ( Math.random() - 0.5 ) );
			ilist.add( r );                    // add method
		}

		System.out.print( "Number of elements stored: " + ilist.size() );  // size method
		for (int i=0; i<ilist.size(); i++)                                 // size method
			System.out.print( "   " + i + "-> " + ilist.get( i ) + ", " ); // get method
		System.out.println();
		
		System.out.println("Removing item 5");
		ilist.remove( 5 );                     // remove method
		
		System.out.print( "Number of elements stored: " + ilist.size() );
		for (int i=0; i<ilist.size(); i++) 
			System.out.print( "   " + i + "-> " + ilist.get( i ) + ", " ); // get method
		System.out.println();
		
		System.out.println("Copy from ilist to backup:");
		IntegerList backup = new IntegerList();
		for (int i=0; i<ilist.size(); i++) 
			backup.add( ilist.get( i ) );
		
		System.out.println("Clear items in ilist");
		ilist.clear();                                                    // clear method
		System.out.print( "Number of elements stored now in ilist: " + ilist.size() );
		for (int i=0; i<ilist.size(); i++) 
			System.out.print( "   " + i + "-> " + ilist.get( i )  + ", " );
		System.out.println( "\n  Is the list empty? " + ilist.isEmpty() ); // isEmpty method
		
		
		System.out.println("\n\nCopy back from backup back to ilist.");
		for (int i=0; i<backup.size(); i++) 
			ilist.add( backup.get( i ) );
		System.out.print( "Number of elements stored now in ilist: " + ilist.size() );
		for (int i=0; i<ilist.size(); i++) 
			System.out.print( "   " + i + "-> " + ilist.get( i )  + ", " );
		System.out.print("\n\nRemove items from ilist, one at a time: ");
		for (int i=ilist.size()-1; i>=0; i--)
			System.out.print( "   " + i + "-> " + ilist.remove( i ) );     // remove method
		System.out.println( "\n  Is the list empty? " + ilist.isEmpty() );
	}
}