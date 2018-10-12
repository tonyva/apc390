package edu.uwex.apc390.lesson8_7;

/**
 * @author Anthony Varghese
 *
 */
public class Person implements Comparable<Person>{
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

	
	public void print() {
		System.out.println(" Person object: " + toString() );
	}

	/**
	 * From Object class
	 */
	@Override
	public String toString() {
		return "[" + name + ", " + address + "]";
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

	@Override
	public int compareTo(Person o) {
		int nameCompare = this.name.compareToIgnoreCase(o.name);
		if (nameCompare == 0)
			return this.address.compareToIgnoreCase(o.address);
		return nameCompare;
	}
}