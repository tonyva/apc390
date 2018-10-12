package edu.uwex.apc390.lesson7_1;

import javax.swing.JOptionPane;

/**
 * @author Anthony Varghese
 *
 */
public class Programmer extends Person implements Showable {
	private String languages;
	
	
	public Programmer() {
		super();
		String empty = "";
		setName( empty );
		setAddress( empty );
		languages =  new String("none");
	}

	public Programmer(String name) {
		super(name);
		String empty = "";
		setAddress( empty );
		languages =  new String("none");
	}

	public Programmer(String name, String address) {
		super(name, address);
		languages = new String("none");
	}

	public Programmer(String name, String address, String languages) {
		super(name, address);
		this.languages = languages;
	}

	/** 
	 * From: Showable#show()
	 */
	@Override
	public void show() {
		JOptionPane.showMessageDialog(null, "Programmer: " + toString() );
	}

	/**
	 * From the Printable interface 
	 */
	@Override
	public void print() {
		System.out.println(" Programmer object: " + toString() );
	}

	/**
	 * From Object class
	 */
	@Override
	public String toString() {
		return "[name=" + getName() + ", address=" + getAddress() + 
				 ", languages: " + languages + "]";
	}

	public String getLanguages() {
		return languages;
	}


	public void setLanguages(String languages) {
		this.languages = languages;
	}
}
