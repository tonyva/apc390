package edu.uwex.apc390.lesson9_1;

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
	public boolean seqSearch(final int searchKey) {
		for (Integer i: items)
			if ( (i != null) && (i == searchKey) )
				return true;
		return false;
	}

	/**
	 * Search using a foreach loop and return first location
	 */
	public int seqSearchLocation(final int searchKey) {
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
	public boolean[] seqSearchLocations(final int searchKey) {
		boolean[] found = new boolean[ capacity ];
		int loc = 0;
		for (Integer i: items)
			found[loc++] = (i != null) && (i == searchKey);
		return found;
	}

	/**
	 * Search for items within the two keys inclusive
	 */	
	public boolean[] seqSearchLocations(final int searchKey1, final int searchKey2) {
		boolean[] found = new boolean[ capacity ];
		int loc = 0;
		for (Integer i: items)
			found[loc++] = (i != null) && (i >= searchKey1) && (i <= searchKey2);
		return found;
	}

}