package edu.uwex.apc390.lesson6_2;

import java.io.PrintStream;

public class ControlFlow1 {
	private static PrintStream out = System.out;
	public static void main(String[] args) {
		out.println( "Starting ... " );
		try {
			int i = 0;
			int j = i + 1;
			out.println( " Try: i:" + i + ", j:" + j );
		} catch (ArithmeticException ae) {
			out.println( " Exception caught!" );
		} finally {
			out.println( " finally" );
		}
		out.println( "done!" );
	}

}
