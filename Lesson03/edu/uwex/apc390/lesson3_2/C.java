package edu.uwex.apc390.lesson3_2;

public class C extends A {
	public    int x, xB;
    		  int a, aB;
    protected int b, bB;
    private   int c, cB;
    public C() {
    	// Here is the test  of visibility: 
    	//   let's try to access data members of the "unrelated" 
    	//   class A which is in the same package as this one.
    	A thing = new A();
    	thing.x = 1;
    	thing.a = 2;
    	thing.b = 3;
    	// Error: thing.c = 4;
    }
}
