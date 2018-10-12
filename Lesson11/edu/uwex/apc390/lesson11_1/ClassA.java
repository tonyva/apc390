package edu.uwex.apc390.lesson11_1;

// Cannot import a class if our class has the same class name.
// import a.ClassA;
// import edu.ClassA;

// The following import works but it masks the ClassB class in this package!
import a.ClassB;

public class ClassA {

	public ClassA() { }
	public String toString() { return "ClassA in package edu.uwex.apc390.lesson11_1."; }

	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println("Hello from class ClassA: " + a );
		
		ClassB b = new ClassB();
		System.out.println("using variable b: " + b );
		
		System.out.println("using variable b2: ... ");
		edu.uwex.apc390.lesson11_1.ClassB b2 = new edu.uwex.apc390.lesson11_1.ClassB();
		System.out.println("   b2: " + b2 );
	}	
}
