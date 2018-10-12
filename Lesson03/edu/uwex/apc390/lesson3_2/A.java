package edu.uwex.apc390.lesson3_2;

public class A {
	public    int x, xA;
	          int a, aA;
	protected int b, bA;
	private   int c, cA;
	public A() {
	    	// Here is the test of visibility: 
	    	//   let's try to access data members of this class
	    	x = 1;
	    	a = 2;
	    	b = 3;
	    	c = 4;
	    	// Within the same class, we can access all data members and methods.
	    }
}
