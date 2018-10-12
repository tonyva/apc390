package edu.uwex.apc390.lesson3_3;

public class E extends edu.uwex.apc390.lesson3_2.A {
	public    int x, xB;
    		  int a, aB;
    protected int b, bB;
    private   int c, cB;

    public E() {
    	// Here is the test of visibility: 
    	//   let's try to access data members of the superclass A,
    	//   which is in another package
    	super.x = 1;
    	// Error: super.a = 2;
    	super.b = 3;
    	// Error: super.c = 4;
    	// Summary: This is what we would consider "standard" subclass visibility
    	//     - we can access public and protected data members of the superclass
    	//     Since this class is not in the same package as the superclass,
    	//     we cannot access "default" visibility data members.
    }
}
