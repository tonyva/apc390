package edu.uwex.apc390.lesson9_1;

import javax.swing.JOptionPane;

/**
 * @author Anthony Varghese
 * Refactored version of Search2 - use a container class, IntegerList
 */
public class Search3 {
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
		int searchKey = Integer.parseInt( JOptionPane.showInputDialog("Enter a number between " + min + " and " + max ));
		JOptionPane.showMessageDialog(null, "You entered " + searchKey );

		// Check if the number is in the array
		boolean found = intList.seqSearch( searchKey );
		String message = "The item " + searchKey;
		if (found)
			message = message + " was found in the list!";
		else
			message = message + " was not found in the list!";
		JOptionPane.showMessageDialog(null, message );
	}
}