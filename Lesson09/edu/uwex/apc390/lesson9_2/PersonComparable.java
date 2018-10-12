package edu.uwex.apc390.lesson9_2;

/**
 * @author Anthony Varghese
 *
 */
public class PersonComparable implements Comparable<PersonComparable>{
	private String name;
	private String address;
	
	public PersonComparable() {
		super();
		name = address = new String("");
	}

	public PersonComparable(String name) {
		super();
		this.name = name;
		this.address = new String("");
	}

	public PersonComparable(String name, String address) {
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

	@Override
	public boolean equals(Object other) {
		PersonComparable o = (PersonComparable) other;
		return this.name.equals( o.name ) && this.address.equals( o.address );
	}

	@Override
	public int compareTo(PersonComparable o) {
		int nameCompare = this.name.compareToIgnoreCase(o.name);
		if (nameCompare == 0)
			return this.address.compareToIgnoreCase(o.address);
		return nameCompare;
	}
}