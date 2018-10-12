package edu.uwex.apc390.lesson9_1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * @author Anthony Varghese
 * Refactored version of Search1 - simplify the search method
 */
public class Search2 {
	private static final int LISTSIZE = 10;
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		final int[] intList = new int[LISTSIZE];
		final int min = -10;
		final int max =  10;
		fillWithRandomNumbers(intList, min, max); // fill intList with random numbers between -10 and 10

		System.out.println(" Array filled with random numbers:\n   " + Arrays.toString( intList ) );
		
		// Ask the user for a number
		int searchKey = Integer.parseInt( JOptionPane.showInputDialog("Enter a number between " + min + " and " + max ));
		JOptionPane.showMessageDialog(null, "You entered " + searchKey );

		// Check if the number is in the array
		boolean found = seqSearch(intList, searchKey);
		String message = "The item " + searchKey;
		if (found)
			message = message + " was found in the array!";
		else
			message = message + " was not found in the array!";
		JOptionPane.showMessageDialog(null, message );
	}

	/**
	 * Adapted from: Java Programming 5th Ed.
	 * @author Malik, DS. 
	 * @author Anthony Varghese
	 * Refactored to use a for loop, simpler inputs
	 */
	private static boolean seqSearch(final int[] list, final int searchKey) {
		for (int loc=0; loc<list.length; loc++)
			if (list[loc] == searchKey)
				return true;
		return false;
	}

	/**
	 * Fill an int array with random numbers between min and max
	 * @param list
	 * @param min - minimum value
	 * @param max - maximum value
	 */
	private static void fillWithRandomNumbers(final int[] list, final int min, final int max) {
		for (int i=0; i<list.length; i++)
			list[i] = min + (int)(Math.random() * (max-min));
	}
}