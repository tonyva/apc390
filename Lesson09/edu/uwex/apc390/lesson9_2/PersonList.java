package edu.uwex.apc390.lesson9_2;

import java.util.Arrays;

public class PersonList {
	private static final int DEFAULTCAPACITY = 100;
	private static final Exception BADCAP = new Exception("Bad capacity request");
	//private static final PersonComparable keyNotFound = new PersonComparable("Nobody", "Nowhere");
	private PersonComparable[] items;
	private int size = 0;
	private int capacity;
	
	public PersonList() {
		capacity = DEFAULTCAPACITY;
		items = new PersonComparable[ capacity ];
	}

	public PersonList(int cap) throws Exception {
		if (cap < 0)
			throw BADCAP;
		capacity = cap;
		items = new PersonComparable[ capacity ];
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
	
	public PersonComparable get(int index) {
		if ( index < 0 || index >= capacity )
			throw new ArrayIndexOutOfBoundsException();
		if ( index < size )
			return items[index];
		return null;
	}
	
	public boolean add(PersonComparable i) {
		if (size == capacity )
			return false;
		items[size] = i;
		size++;
		return true;
	}
	
	public PersonComparable remove( int index ) {
		if ( index < 0 || index >= capacity )
			throw new ArrayIndexOutOfBoundsException();
		if ( index < size ) {
			// Save the result we want to return
			PersonComparable result = items[ index ];
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
	public boolean seqSearch(PersonComparable searchKey) {
		for (PersonComparable i: items)
			if ( ( i != null ) && ( i.equals(searchKey) ) )
				return true;
		return false;
	}

	/**
	 * Adapted from: Java Programming 5th Ed.
	 * @author Malik, DS. 
	 * @author Anthony Varghese
	 */
	public void bubbleSort() {
		final int length = size; // assume locations 0-size-1 are not null!
		for (int counter = 0; counter < length-1; counter++) {
            for (int index = 0; index < length-1-counter; index++)
                if (items[index].compareTo( items[index + 1] ) > 0 ) {
                	// Swap
                	PersonComparable temp = items[index];
                    items[index] = items[index + 1];
                    items[index + 1] = temp;
                }
        }
	}
}