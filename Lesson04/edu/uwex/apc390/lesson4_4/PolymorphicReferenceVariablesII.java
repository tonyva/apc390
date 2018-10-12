package edu.uwex.apc390.lesson4_4;

public class PolymorphicReferenceVariablesII {
	public static void main(String[] args) {
		class A{}
		class B extends A{}
		class C extends B{} // different inheritance here!

		A e = new A();
		B f = new B();
		A g = new B();
		A h = new C();
		C i = new C();
		
		// What are all the ways we can make assignments between
		// the above 5 variables?
		// Which ones will work?
		// What can you tell about the assignments that do work?
		e = f;
		e = g;
		e = h;
		e = i;
		
		// f = 
		
		g = e;
		g = f;
		g = h;
		g = i;
		
		h = e;
		h = f;
		h = g;
		h = i;
		
		// i = 
		
		// What do these assignment statements tell us about which
		// variables we can use as polymorphic reference variables? 
		// What is common about these polymorphic reference variables?
	}
}
