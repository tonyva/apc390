package edu.uwex.apc390.lesson6_2;

import java.io.PrintStream;

public class ControlFlow4 {
	private static PrintStream out = System.out;
	public static void main(String[] args) {
		out.println( "Starting ... " );
		m1();
		out.println( "done!" );
	}
	private static void m1() {
		out.println( " m1 starting" );
		m2();
		out.println( " m1 done!" );
	}
	private static void m2() {
		out.println( "  m2 starting" );
		try {
			int i = 0;
			int j = 1/i;
			out.println( "   Try: i:" + i + ", j:" + j );
		} finally {
			out.println( "   finally" );
		}
		out.println( "  m2 done!" );
	}
}
