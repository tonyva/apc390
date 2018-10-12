package edu.uwex.apc390.lesson7_4;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Penny", "Green Bay");
		Person person2 = new Person("Paul", "Madison");
		Person person3 = person1.clone();
		
		person1.display("");
		person2.display("");
		person3.display(" is a clone");
	}

}
