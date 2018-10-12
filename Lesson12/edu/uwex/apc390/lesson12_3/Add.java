package edu.uwex.apc390.lesson12_3;

/**
 * Add class
 * 	Has methods to add numbers from 1 to N. That is compute 1 + 2 + 3 + ... + N
 *  One method uses a loop and the other uses recursion to do the same thing.
 * @author Anthony Varghese
 */
public class Add {
	public static void main(String[] args) {
		final int N = 1000;
		System.out.println("Iterative add from 1 to " + N + ":  " + iterativeadd( N ));
		System.out.println("Recursive add from 1 to " + N + ":  " + recursiveadd( N ));	
	}

	/**
	 * iterativeadd
	 *    add all numbers from 1 up to input n
	 * @param n
	 * @return int - sum
	 */
	private static int iterativeadd(int n) {
		int sum = 0;
		for (int i=n; i>=0; i--)
			sum += i;
		return sum;
	}

	
	/**
	 * recursiveadd
	 *    add all numbers from 1 up to input n
	 * @param n
	 * @return int - sum
	 */
	private static int recursiveadd(int n) {
		if (n > 0) {
			return n + recursiveadd(n-1);
		} else 
			return 0;
	}
}
