package edu.uwex.apc390.lesson4_1;

public class Main {

	public static void main(String[] args) {
		A y = new A(); // instance of class A
		B z = new B(); // instance of class B
		
		A x = new B(); // x is a polymorphic reference variable
		// B xx = new A(); // cannot do this!
	}

}
