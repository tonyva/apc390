package edu.uwex.apc390.lesson7_1;

public class Main {

	public static void main(String[] args) {
		// person1 is declared to be of type Person 
		Person person1 = new Person("Penny", "Green Bay");
		person1.print();

		// person2 is a polymorphic reference variable
		//   declared to be of type Printable but refers to an instance of Person
		Printable person2 = new Person("Paul", "Madison");
		person2.print();
		
		// obj is also a polymorphic reference variable 
		//   declared to be of type Printable but refers to an instance of an anonymous class
		Printable obj = new Printable() {
			@Override
			public void print() {
				System.out.println("Hello!");
			}	
		};
		obj.print();
	}

}
