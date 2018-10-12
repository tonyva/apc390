package edu.uwex.apc390.lesson5_1;

/*
 * A somewhat usable abstract class - 
 *   this class is the superclass of MyConcreteClass
 * Some things to try in this class:
 *   - remove the abstract modifier of the setName method or the class itself
 *      Does the compiler give you an error?
 */
public abstract class MyAbstractClass3 {
	protected String name;
	protected MyAbstractClass3(final String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public abstract void setName(String s);
}