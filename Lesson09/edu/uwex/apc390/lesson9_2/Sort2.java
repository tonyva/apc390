package edu.uwex.apc390.lesson9_2;

/**
 * @author Anthony Varghese
 * Refactored version of Sort1 - use a container class, IntegerList
 */
public class Sort2 {
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
		
		intList.selectionSort();
		System.out.println(" List in sorted order using Selection sort:\n   " + intList);
	}
}