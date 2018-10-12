package edu.uwex.apc390.lesson7_1;

import javax.swing.JOptionPane;

public class Main2 {

	public static void main(String[] args) {
		// progr1 is a polymorphic reference variable
		//   declared to be of type Person 
		Person progr1 = new Programmer("Penny", "Green Bay", "C++");
		progr1.print();
		// Cannot do progr1.show();
		
		// progr2 is a polymorphic reference variable
		//   declared to be of type Showable but refers to an instance of Programmer
		Showable progr2 = new Programmer("Paul", "Madison", "C");
		progr2.print();
		progr2.show();
		
		// obj is also a polymorphic reference variable 
		//   declared to be of type Printable but refers to an instance of an anonymous class
		Printable obj = new Showable() {
			@Override
			public void print() {
				System.out.println("Hello!");
			}

			@Override
			public void show() {
				JOptionPane.showMessageDialog(null, "Hello, again!" );
			}	
		};
		obj.print();
		((Showable) obj).show();
	}

}
