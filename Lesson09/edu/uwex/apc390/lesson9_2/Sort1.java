package edu.uwex.apc390.lesson9_2;

import java.util.Arrays;

/**
 * @author Malik, DS. Java Programming 5th Ed.
 * @author Anthony Varghese
 *
 */
public class Sort1 {
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
		
		int[] sorted = selectionSort( intList );
		System.out.println(" Array in sorted order:\n   " + Arrays.toString( sorted ) );
	}

	/**
	 * Adapted from: Java Programming 5th Ed., pp. 911-912
	 * @author Malik, DS. 
	 * @author Anthony Varghese
	 *
	 */
	private static int[] selectionSort( final int[] list ) {
		final int length = list.length;
		int[] result = Arrays.copyOf(list, length);
		
		for (int index=0; index < length-1; index++) {
			// Step a - find the smallest item from index to length
			int smallest = index;
			for (int minIndex=index+1; minIndex<length; minIndex++)
				if (result[minIndex] < result[smallest])
					smallest = minIndex;
			// Step b - swap the numbers at the [smallest] and the [index] locations
			int temp = result[smallest];
			result[smallest] = result[index];
			result[index] = temp;
		}
		return result;
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