package edu.uwex.apc390.lesson6_4;

public class CustomExceptionExample2 {
	public static void main(String[] args) {
		class A extends Throwable{}
		class B extends A{}

		try {
			throw new A();
		} catch( Throwable e) {
			System.out.println("Throwable caught!");
			e.printStackTrace();
		} finally {
		}
	}
}