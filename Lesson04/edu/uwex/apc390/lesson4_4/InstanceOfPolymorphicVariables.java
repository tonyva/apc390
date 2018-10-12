package edu.uwex.apc390.lesson4_4;

public class InstanceOfPolymorphicVariables {
	public static void main(String[] args) {
		class A{}
		class B extends A{}
		class C extends A{}

		A e = new A();
		B f = new B();
		A g = new B();
		A h = new C();
		C i = new C();
		B k = null;
		
		// Let's check the types of objects and variables.
		System.out.println("           instanceOf:");
		System.out.println("       A       B       C");
		System.out.println("A e  " + (e instanceof A) +  "    " + 
							(e instanceof B) +  "   " + (e instanceof C));
		System.out.println("B f  " + (f instanceof A) +  "    " + 
							(f instanceof B)); //+  "   " + (f instanceof C));
		System.out.println("A g  " + (g instanceof A) +  "    " + 
							(g instanceof B) +  "    " + (g instanceof C));
		System.out.println("A h  " + (h instanceof A) +  "    " + 
							(h instanceof B) +  "   " + (h instanceof C));
		System.out.println("C i  " + (i instanceof A) +  "    " + 
							/* (i instanceof B) */   "        " + (i instanceof C));
		System.out.println("B k  " + (k instanceof B) +  "   " + 
							(k instanceof B)); // +  "   " + (k instanceof C));
	}
}
