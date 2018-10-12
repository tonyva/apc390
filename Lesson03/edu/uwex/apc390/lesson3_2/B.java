package edu.uwex.apc390.lesson3_2;

public class B extends A {
	public    int x, xB;
    		  int a, aB;
    protected int b, bB;
    private   int c, cB;
    
    public B() {
    	// Here is the test of visibility: 
    	//   let's try to access data members of the superclass A
    	super.x = 1;
    	super.a = 2;
    	super.b = 3;
    	// Error: super.c = 4;
    	// Since B is in the same package as A, the rules for any other class
    	//   in this package (for example, the unrelated class C) apply to B!
    }
}
