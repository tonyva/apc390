package edu.uwex.apc390.lesson6_4;

public class CustomExceptionExample3 {
	public static void main(String[] args) {
		class A extends Exception{}
		class B extends A{}

		try {
			int i = 1;
			int j = 1/i;
			throw new B();
		} catch( B | RuntimeException e) {
			System.out.println("Exception caught!");
			e.printStackTrace();
		} finally {
		}
	}
}