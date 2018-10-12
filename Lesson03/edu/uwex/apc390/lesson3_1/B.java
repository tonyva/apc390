package edu.uwex.apc390.lesson3_1;

public class B extends A {
	
	// Explicit default constructor for the B class:
	public B() {
		super(); // explicitly call the default constructor of the superclass.
		// Error:
		// A(); // we cannot call the constructor by name - we can only use super().
		// The call to super() would automatically happen even if we did not do
		// so explicitly. 
	}
	
	// Overloaded constructor with one parameter:
	public B(int v) { super(v); }

	// This next method is an example of overloading the add method to work with
	// two ints rather than just 1 in this class and in the superclass.
	public int add(int x, int y) { return x + y + super.getValue(); }
	
	@Override
	public int add(int x) { return x + 2 * super.getValue(); }

	@Override
	public String toString() { return "B object with value: " + super.getValue(); }
}
