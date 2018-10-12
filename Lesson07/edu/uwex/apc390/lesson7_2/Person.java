package edu.uwex.apc390.lesson7_2;

/**
 * @author Anthony Varghese
 *
 */
public class Person implements Displayable {
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
