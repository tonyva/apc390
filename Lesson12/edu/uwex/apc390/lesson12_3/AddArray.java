package edu.uwex.apc390.lesson12_3;

import java.util.Arrays;

/**
 * Add class
 * 	Has methods to add the elements of a list. That is compute a[0]+ a[1] + a[2] + ... + a[N-1]
 *  One method uses a loop and the other uses recursion to do the same thing.
 * @author Anthony Varghese
 */
public class AddArray {
	private static final int LISTSIZE = 100;
	public static void main(String[] args) {
		final int[] intList = new int[LISTSIZE];
		final int min = -10;
		final int max =  10;
		fillWithRandomNumbers(intList, min, max); // fill intList with random numbers between -10 and 10

		System.out.println(" Array filled with random numbers:\n   " + Arrays.toString( intList ) );
		System.out.println("Iterative add:  " + iterativeadd( intList ));
		System.out.println("Recursive add:  " + recursiveadd( intList, intList.length ));	
	}

	/**
	 * iterativeadd
	 *    add the contents of an input array
	 * @param int[] a
	 * @return int - sum
	 */
	private static int iterativeadd(int[] array) {
		int sum = 0;
		for (int i : array)
			sum += i;
		return sum;
	}
	
	
	
	/**
	 * recursiveadd
	 *    add the contents of an input array
	 * @param int[] a, int n
	 * @return int - sum
	 */
	private static int recursiveadd(int[] array, int n) {
		if (n > 1) {
			return array[n-1] + recursiveadd(array, n-1);
		} else 
			return array[0];
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

