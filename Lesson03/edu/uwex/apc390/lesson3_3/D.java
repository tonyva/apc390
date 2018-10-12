package edu.uwex.apc390.lesson3_3;

import edu.uwex.apc390.lesson3_2.A;

public class D {
	public    int x, xB;
    		  int a, aB;
    protected int b, bB;
    private   int c, cB;
 
    public D() {
    	// Here is the test of visibility: 
    	//   let's try to access data members of the unrelated class A,
    	//   which is in another package
    	A thing = new A();
    	thing.x = 1;
    	// Error: thing.a = 2;
    	// Error: thing.b = 3;
    	// Error: thing.c = 4;
    	// Summary: A class that is not related to another class and is not in
    	//          the same package can only access public data members and methods
    }
}
