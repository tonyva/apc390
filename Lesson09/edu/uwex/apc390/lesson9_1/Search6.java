package edu.uwex.apc390.lesson9_1;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @author Anthony Varghese
 * Search for all locations of a range of values
 *  - uses the IntegerList container class
 */
public class Search6 {
	private static final int LISTSIZE = 10;
	/**
	 * main
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// set up a list filled with random numbers between -10 and 10
		final int min = -10;
		final int max =  10;
		final IntegerList intList = new IntegerList(LISTSIZE, min, max);

		System.out.println(" List filled with random numbers:\n   " + intList );
		
		// Ask the user for a number
		int searchKey1 = Integer.parseInt( JOptionPane.showInputDialog("Enter one number of the range to search for " ) );
		int searchKey2 = Integer.parseInt( JOptionPane.showInputDialog("Enter the other number of the range to search for " ) );
		JOptionPane.showMessageDialog(null, "You entered " + searchKey1 + " and " + searchKey2 );

		// we want searchKey1 to be smaller or the same as searchKey2
		if (searchKey1 > searchKey2) {	// swap
			int temp = searchKey1; searchKey1 = searchKey2; searchKey2 = temp;
		}

		// Find all the locations in the list that are between the two keys inclusive
		boolean[] found = intList.seqSearchLocations( searchKey1, searchKey2 );
		String message = "The items between " + searchKey1 + " and " + searchKey2;
		if ( isAnyTrue(found) )
			message = "The items between " + searchKey1 + " and " + searchKey2 + " were found at these locations: " + Arrays.toString( found ) + ".";
		else
			message = "No items in the list were between " + searchKey1 + " and " + searchKey2;
		JOptionPane.showMessageDialog(null, message );
	}
	
	private static boolean isAnyTrue( boolean[] input) {
		// Scan the array for true values
		for (boolean b : input)
			if ( b )
				return true;
		return false;
	}
}