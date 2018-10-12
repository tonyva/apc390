package edu.uwex.apc390.lesson11_1;

public class ClassB {
	public ClassB() {	
		ClassA a1 = new ClassA();
		System.out.println("   a1 is " + a1);
		edu.ClassA a2 = new edu.ClassA();
		System.out.println("   a2 is " + a2);
		
	}
	public String toString() { return "ClassB in package edu.uwex.apc390.lesson11_1."; }
}