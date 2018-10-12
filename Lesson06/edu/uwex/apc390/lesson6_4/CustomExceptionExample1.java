package edu.uwex.apc390.lesson6_4;

public class CustomExceptionExample1 {
	public static void main(String[] args) {
		class A extends Exception{}
		class B extends A{}

		try {
			throw new B();
		} catch( B e) {
			System.out.println("Exception B caught!");
			e.printStackTrace();
		} catch( A e) {
			System.out.println("Exception A caught!");
			e.printStackTrace();
		} finally {
		}
	}
}