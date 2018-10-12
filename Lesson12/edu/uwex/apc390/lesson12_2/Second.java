package edu.uwex.apc390.lesson12_2;

public class Second {

	public static void main(String[] args) {
		System.out.println("Calling an iterative countdown method ... ");
		iterativecountdown(5);
		System.out.println(" ... done!");

		System.out.println("Calling a recursive countdown method ... ");
		recursivecountdown(5);
		System.out.println(" ... done!");
	}

	private static void iterativecountdown(int n) {
		for (int i=n; i>=0; i--)
			System.out.print( " " + i );
	}
	private static void recursivecountdown(int n) {
		if (n >= 0) {
			System.out.print( " " + n );
			recursivecountdown(n-1);
		} else 
			System.out.print("");
	}

}
