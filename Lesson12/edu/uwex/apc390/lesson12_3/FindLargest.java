package edu.uwex.apc390.lesson12_3;

import java.util.Arrays;

/**
 * FindLargest class
 * 	Has methods to find the largest number in an array 
 *  One method uses a loop and the other two use recursion to do the same thing.
 * @author Anthony Varghese
 */
public class FindLargest {
	private static final int LISTSIZE = 100;
	public static void main(String[] args) {
		final int[] intList = new int[LISTSIZE];
		final int min = -2000;
		final int max =  2000;
		fillWithRandomNumbers(intList, min, max); // fill intList with random numbers between -10 and 10

		System.out.println(" Array filled with random numbers:\n   " + Arrays.toString( intList ) );
		System.out.println("Iterative max:    " + iterMax( intList ));
		System.out.println("Recursive max 1:  " + recMax1( intList ));
		System.out.println("Recursive max 2:  " + recMax2( intList ));
	}

	/**
	 * iterMax
	 *    find the largest element in an input array
	 * @param int[] a
	 * @return int - max
	 */
	private static int iterMax(int[] array) {
		int max = array[0];
		for (int i : array)
			if (i > max)
				max = i;
		return max;
	}
	
	
	
	/**
	 * recMax1
	 *    find the largest element in an input array
	 * @param int[] a
	 * @return int - max
	 */
	private static int recMax1(int[] array) {
		return recMax1( array, 0, array.length-1);
	}


	/**
	 * recMax1
	 *    find the largest element in an input array
	 * @param int[] a, int start, int end
	 * @return int - max
	 */
	private static int recMax1(int[] array, int start, int end) {
		int startvalue = array[start];
		if (start < end) {
			int maxOfRest  = recMax1( array, start+1, end);
			if ( startvalue > maxOfRest )
				return startvalue;
			else
				return maxOfRest;
		} else 
			return startvalue;
	}

	/**
	 * recMax2
	 *    find the largest element in an input array
	 * @param int[] a
	 * @return int - max
	 */
	private static int recMax2(int[] array) {
		return recMax2( array, 0, array.length-1);
	}

	/**
	 * recMax2
	 *    find the largest element in an input array
	 * @param int[] a, int start, int end
	 * @return int - max
	 */
	private static int recMax2(int[] array, int start, int end) {
		int mid = (start + end) / 2;
		if (start < end) {
			int maxOfFirstHalf   = recMax2( array, start, mid);
			int maxOfSecondHalf  = recMax2( array, mid+1, end);
			if ( maxOfFirstHalf > maxOfSecondHalf )
				return maxOfFirstHalf;
			else
				return maxOfSecondHalf;
		} else 
			return array[start];
	}

	/**
	 * Fill an int array with random numbers between min and max
	 * @param list
	 * @param min - minimum value
	 * @param max - maximum value
	 */
	private static void fillWithRandomNumbers( final int[] list, final int min, final int max) {
		for (int i=0; i<list.length; i++)
			list[i] = min + (int)(Math.random() * (max-min));
	}

}

