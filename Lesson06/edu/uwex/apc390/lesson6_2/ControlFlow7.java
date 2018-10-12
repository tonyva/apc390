package edu.uwex.apc390.lesson6_2;

import java.io.PrintStream;

public class ControlFlow7 {
	private static PrintStream out = System.out;
	public static void main(String[] args) {
		out.println( "Starting ... " );
		m1();
		out.println( "done!" );
	}
	private static void m1() {
		out.println( " m1 starting" );
		try {
			int i = 0;
			if ( i == 0 )
				throw new ArithmeticException();
			int j = 1 / i;
			out.println( "  Try: i:" + i + ", j:" + j );
		} catch(ArithmeticException ae){
			out.println( "  Exception caught!" );
		} finally {
			out.println( "  finally" );
		}
		out.println( " m1 done!" );
	}
}
