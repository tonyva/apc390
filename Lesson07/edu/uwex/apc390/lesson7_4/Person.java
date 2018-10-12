package edu.uwex.apc390.lesson7_4;

import edu.uwex.apc390.lesson7_2.Displayable;

/**
 * @author Anthony Varghese
 *
 */
public class Person implements Displayable, Comparable, Cloneable {
	private String name;
	private String address;
	
	
	public Person() {
		super();
		name = address = new String("");
	}

	public Person(String name) {
		super();
		this.name = name;
		this.address = new String("");
	}

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	/**
	 * From Object class via Cloneable
	 */
	@Override
	public Person clone() {
		return new Person(this.name + " II", this.address);
	}

	/**
	 * From the Comparable interface 
	 */
	@Override
	public int compareTo(Object o) {
		Person other = (Person) o;
		return other.name.compareTo(this.name);
	}


	/**
	 * From the Displayable interface 
	 */
	@Override
	public void display(String s) {
		if ( Displayable.isValid(name, Displayable.DISPLAY_IDENTITY) )
			System.out.println(" Person object: " + toString() + " " + s);
	}

	/**
	 * From Object class
	 */
	@Override
	public String toString() {
		return "[name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
}
