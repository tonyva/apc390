package edu.uwex.apc390.lesson4_4;

public class PolymorphicReferenceVariablesI {
	public static void main(String[] args) {
		class A{}
		class B extends A{}

		A x = new A();
		B y = new B();
		A z = new B();
		
		// Uncomment the 3 assignment statements commented out below and 
		// note what compiler error messages you get.
		x = y;
		// cannot do this:
		// y = x;
		
		x = z;
		z = x;
		
		// cannot do this:
		// y = z;
		z = y;
		
		// Based on these assignment statements, which variables can we
		// use as polymorphic reference variables? 
		// What is common about these polymorphic reference variables?
	}
}
