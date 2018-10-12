package edu.uwex.apc390.lesson12_2;

public class FirstRunawayRecursion {

	public static void main(String[] args) {
		System.out.println("Calling a recursive method ... ");
		m();
		System.out.println(" ... done!");
	}

	private static void m() {
		m();
	}

}
