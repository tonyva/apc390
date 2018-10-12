package edu.uwex.apc390.lesson7_3;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Penny", "Green Bay");
		Person person2 = new Person("Paul", "Madison");
		
		if (person1.compareTo(person2) <= 0)
			System.out.println("" + person1 + " before " + person2);
		else
			System.out.println("" + person1 + " after " + person2);
	}

}
