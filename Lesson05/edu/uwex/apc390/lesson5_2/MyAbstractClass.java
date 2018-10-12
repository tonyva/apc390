package edu.uwex.apc390.lesson5_2;

public abstract class MyAbstractClass {
	private String name;
	protected MyAbstractClass(final String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public abstract void setName(String s);
	
	public static void main(String[] a) {
		System.out.println("Hello from my abstract class!");
	}
}
