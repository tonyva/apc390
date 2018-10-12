package edu.uwex.apc390.lesson6_3;

public class CheckedExceptionExample2 {
	public static void main(String[] args) {
		try {
			throw new Exception("Hello!");
		}
		// Comment out the next 4 lines - what is the compiler error?
		catch( Exception e) {
			System.out.println("Exception caught!");
			e.printStackTrace();
		} 
		finally {
		}		
	}
}