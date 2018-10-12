package edu.uwex.apc390.lesson8_1;

public class IntegerList {
	private static final int CAPACITY = 100; 
	private Integer[] items = new Integer[ CAPACITY ];
	private int size = 0;
	
	public IntegerList() {		
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int size() {
		return size;
	}
	
	public int getCapacity() {
		return CAPACITY;
	}
	
	public Integer get(int index) {
		if ( index < 0 || index >= CAPACITY )
			throw new ArrayIndexOutOfBoundsException();
		if ( index < size )
			return items[index];
		return null;
	}
	
	public boolean add(Integer i) {
		if (size == CAPACITY )
			return false;
		items[size] = i;
		size++;
		return true;
	}
	
	public Integer remove( int index ) {
		if ( index < 0 || index >= CAPACITY )
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
}
