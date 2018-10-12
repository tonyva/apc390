package edu.uwex.apc390.lesson9_2;

import java.util.Arrays;

public class IntegerList {
	private static final int DEFAULTCAPACITY = 100;
	private static final String BADCAPACITYREQUEST = "Request to IntegerList constructor for negative capacity";
	private static final Integer keyNotFound = -1;
	private Integer[] items;
	private int size = 0;
	private int capacity;
	
	public IntegerList() {
		capacity = DEFAULTCAPACITY;
		items = new Integer[ capacity ];
	}

	public IntegerList(int cap) throws Exception {
		if (cap < 0)
			throw new Exception(BADCAPACITYREQUEST);
		capacity = cap;
		items = new Integer[ capacity ];
	}

	public IntegerList(int cap, int min, int max) throws Exception {
		if (cap < 0)
			throw new Exception(BADCAPACITYREQUEST);
		size = capacity = cap;
		items = new Integer[ capacity ];
		fillWithRandomNumbers( min, max );
	}

	private void fillWithRandomNumbers(int min, int max) {
		for (int i=0; i<items.length; i++)
			items[i] = min + (int)(Math.random() * (max-min));
	}

	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int size() {
		return size;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public Integer get(int index) {
		if ( index < 0 || index >= capacity )
			throw new ArrayIndexOutOfBoundsException();
		if ( index < size )
			return items[index];
		return null;
	}
	
	public boolean add(Integer i) {
		if (size == capacity )
			return false;
		items[size] = i;
		size++;
		return true;
	}
	
	public Integer remove( int index ) {
		if ( index < 0 || index >= capacity )
			throw new ArrayIndexOutOfBoundsException();
		if ( index < size ) {
			// Save the result we want to return
			Integer result = items[ index ];
			// Move all the elements after index up one spot
			for (int i=index; i<size; i++) 
				items[i] = items[i+1];
			// Decrement size
			size--;
			return result;
		}
		return null;
	}
	public void clear() {
		size = 0;
	}
	public String toString() {
		return Arrays.toString( items );
	}

	/**
	 * Search using a foreach loop
	 */
	public boolean seqSearch(int searchKey) {
		for (Integer i: items)
			if ( (i != null) && (i == searchKey) )
				return true;
		return false;
	}

	/**
	 * Search using a foreach loop and return first location
	 */
	public int seqSearchLocation(int searchKey) {
		int location = 0;
		for (Integer i: items) {
			if ( (i != null) && (i == searchKey) )
				return location;
			location++;
		}		
		return keyNotFound;
	}

	/**
	 * Search using a foreach loop and return array where found
	 */	
	public boolean[] seqSearchLocations(int searchKey) {
		boolean[] found = new boolean[ capacity ];
		int loc = 0;
		for (Integer i: items)
			found[loc++] = (i != null) && (i == searchKey);
		return found;
	}

	/**
	 * Search for items within the two keys inclusive
	 */	
	public boolean[] seqSearchLocations(int searchKey1, int searchKey2) {
		boolean[] found = new boolean[ capacity ];
		int loc = 0;
		for (Integer i: items)
			found[loc++] = (i != null) && (i >= searchKey1) && (i <= searchKey2);
		return found;
	}

	/**
	 * Adapted from: Java Programming 5th Ed., pp. 911-912
	 * @author Malik, DS. 
	 * @author Anthony Varghese
	 *
	 */
	public void selectionSort() {
		final int length = size; // assume locations 0-size-1 are not null!
		for (int index=0; index < length-1; index++) {
			// Step a - find the smallest item from index to length
			int smallest = index;
			for (int minIndex=index+1; minIndex<length; minIndex++)
				if (items[minIndex] < items[smallest])
					smallest = minIndex;
			// Step b - swap items[smallest] and items[index]
			int temp = items[smallest];
			items[smallest] = items[index];
			items[index] = temp;
		}
	}

	/**
	 * Adapted from: Java Programming 5th Ed., pp. 916
	 * @author Malik, DS. 
	 * @author Anthony Varghese
	 *
	 */
	public void insertionSort() {
		final int length = size; // assume locations 0-size-1 are not null!
		for (int index=1; index < length; index++)
			if (items[index] < items[index-1]) {
				int temp = items[index];
				int location = index;
				do {
					items[location] = items[location-1];
					location--;
				} while(location>0 && items[location-1]>temp);
				items[location] = temp;
		}
	}
	
	
	/**
	 * Adapted from: Java Programming 5th Ed.
	 * @author Malik, DS. 
	 * @author Anthony Varghese
	 *
	 */
	public void bubbleSort() {
		final int length = size; // assume locations 0-size-1 are not null!
		for (int counter = 0; counter < length-1; counter++) {
            for (int index = 0; index < length-1-counter; index++)
                if (items[index] > items[index + 1]) {
                	// Swap
                    int temp = items[index];
                    items[index] = items[index + 1];
                    items[index + 1] = temp;
                }
        }
	}

	public int binarySearch(int searchKey) {
		int first = 0, last = size-1, middle = first;
		boolean found = false;
		while ( (first <= last) && !found ) {
			middle = (first + last) / 2;
			if (items[middle] == searchKey)
				found = true;
			else if (items[middle] > searchKey)
				 last  = middle - 1;
			else first = middle + 1;
		}
		return found ? middle : keyNotFound;
	}
}