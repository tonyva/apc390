package edu.uwex.apc390.lesson7_2;

public class Main {

	public static void main(String[] args) {
		// person1 is declared to be of type Person 
		Person person1 = new Person("Penny", "Green Bay");
		person1.display(" is OK.");

		// person2 is a polymorphic reference variable
		//   declared to be of type Displayable but refers to an instance of Person
		Displayable person2 = new Person("Paul", "Madison");
		person2.display(" will work.");
		
		// obj is also a polymorphic reference variable 
		//   declared to be of type Printable but refers to an instance of an anonymous class
		Displayable obj = new Displayable() {
			@Override
			public void display(String s) {
				System.out.println("Hello, " + s + "!");
			}	
		};
		obj.display("there");
	}

}
