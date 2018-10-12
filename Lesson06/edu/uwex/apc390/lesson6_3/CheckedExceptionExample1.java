package edu.uwex.apc390.lesson6_3;

public class CheckedExceptionExample1 {
	public static void main(String[] args) {
		try {
			throw new Throwable("Hello!");
		}
		// Comment out the next 4 lines - what is the compiler error?
		catch( Throwable e) {
			System.out.println("Throwable caught!");
			e.printStackTrace();
		} 
		finally {
		}
	}
}