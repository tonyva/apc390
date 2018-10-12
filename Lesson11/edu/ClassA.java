package edu;

public class ClassA {

	public ClassA() {	}
	public String toString() { return "ClassA in edu package."; }

	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println("Hello from class ClassA: " + a );
	}
}
