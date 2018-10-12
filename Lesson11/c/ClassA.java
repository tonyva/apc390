// Comment out the following line, place this class in a default module - error message due to use of modules
package c;

// This is OK
import edu.*;
// This is not OK:
// import edu.ClassA;

public class ClassA {
	public ClassA() {	}
	public String toString() { return "ClassA in package c."; }
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println("Hello from class ClassA: " + a );
		
		ClassB b = new ClassB();
		System.out.println(" variable b: " + b );
	}
}
