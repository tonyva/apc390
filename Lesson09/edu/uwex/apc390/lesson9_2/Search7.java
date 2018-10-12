package edu.uwex.apc390.lesson9_2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * @author Anthony Varghese
 * Search for all locations of a range of values
 *  - uses the IntegerList container class
 */
public class Search7 {
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
		intList.bubbleSort();
		System.out.println(" List filled with random numbers and sorted:\n   " + intList );
		
		// Ask the user for a number
		int searchKey = Integer.parseInt( JOptionPane.showInputDialog("Enter a number between " + min + " and " + max ));
		JOptionPane.showMessageDialog(null, "You entered " + searchKey );

		// Find a location of the key in the list
		int found = intList.binarySearch( searchKey );
		String message = "The item " + searchKey;
		if (found >= 0)
			message = message + " was found in the list at index: " + found + ".";
		else
			message = message + " was not found in the list!";
		JOptionPane.showMessageDialog(null, message );
	}
}