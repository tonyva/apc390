package edu.uwex.apc390.lesson3_1;

public class A {
	protected static final int DEFAULT_VALUE = -1;
	private int value;
	
	// Explicit default constructor for the A class:
	public A() { value = DEFAULT_VALUE; }
	
	// Overloaded constructor with one parameter:
	public A(int v) { value = v; }
	
	// Getter method
	public int getValue() { return value; }
	
	// This add method will be overloaded in the subclass B. 
	//  It will also be overridden in the subclass B
	public int add(int x) { return x + value; }
	
	// This toString method overrides the toString method inherited from the class Object
	// It will be overridden in the subclass B.
	@Override
	public String toString() { return "A object with value: " + value; }
}
