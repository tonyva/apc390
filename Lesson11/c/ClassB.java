// Comment out the following line, place this class in a default module - error message due to use of modules
package c;

// Cannot do this if we have a ClassA.java and this file in the same or default package:
// class ClassA{}

public class ClassB {
	// but this is OK:
	class ClassA{
		public String toString() { return "Internal class ClassA"; }
	}
	private ClassA a;
	
	public ClassB() {	a = new ClassA();	}
	public String toString() { return "ClassB has an: " + a; }
	
	public static void main(String[] args) {
		ClassB b = new ClassB();
		System.out.println("Hello from class ClassB: " + b );
	}

}
