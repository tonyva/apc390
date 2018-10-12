package edu.uwex.apc390.lesson6_1;

public class LetItCrash {
	public static void main(String[] args) {
		class Employee{
			private String name;
			public Employee(String n) {	name = n; }
			public String getName() { return name; }
		}
		Employee e1 = new Employee("Leslie Knope"), e2 = null;
		System.out.println(" Employee 1 is " + e1.getName() );
		System.out.println(" Employee 2 is " + e2.getName() );
	}
}
