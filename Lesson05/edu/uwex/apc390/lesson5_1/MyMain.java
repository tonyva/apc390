package edu.uwex.apc390.lesson5_1;

public class MyMain {

	public static void main(String[] args) {
		MyAbstractClass3 a; // this is OK with Java
		// can do this:
		a = new MyConcreteClass("Leslie");
		System.out.println(" The variable a refers to an instance of: " 
				+ a.getClass().getSimpleName());
		System.out.println("  whose superclass is: " 
				+ a.getClass().getSuperclass().getSimpleName() );
		System.out.println("  and the superclass of the superclass is: " 
				+ a.getClass().getSuperclass().getSuperclass().getSimpleName() );

	}

}
