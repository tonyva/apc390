package edu.uwex.apc390.lesson5_1;

/*
 * This abstract class has a main that we can run!
 * We can have a variable declared to be of type MyAbstractClass2
 *    but we cannot create an instance of it.
 */
public abstract class MyAbstractClass2 {
	public static void main(String[] args) {
		System.out.println("Hello from my abstract class!");
		MyAbstractClass2 a; // this is OK with Java
		// cannot do this:
		// new MyAbstractClass2();
	}
}
