package edu.uwex.apc390.lesson7_1;

/**
 * @author Anthony Varghese
 *
 */
public class Person implements Printable {
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
	 * From the Printable interface 
	 */
	@Override
	public void print() {
		System.out.println(" Person object: " + toString() );
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
