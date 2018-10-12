package edu.uwex.apc390.lesson7_5;

import java.io.Serializable;
import edu.uwex.apc390.lesson7_2.Displayable;

/**
 * @author Anthony Varghese
 *
 */
public class Person implements Displayable, Serializable {
	/**
	 * Set the serial version id to 1
	 */
	private static final long serialVersionUID = 1L;
	
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
