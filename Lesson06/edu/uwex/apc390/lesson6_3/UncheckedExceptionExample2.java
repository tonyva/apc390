package edu.uwex.apc390.lesson6_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionExample2 {
	private static final String filename = "src/edu/uwex/apc390/lesson6_3/inputfile.txt";
	
	public static void main(String[] args) throws IOException {
		FileReader infile = null;
		Scanner    input  = null;
		try {
			infile = new FileReader(filename);
			System.out.println("File " + filename + " opened.");
			input = new Scanner(infile);
			// Read numbers from the file.
			int[] a = new int[4];
			System.out.println("   Numbers read from the file were:");
			for (int i = 0; i<=a.length; i++) {
				a[i] = input.nextInt();
				System.out.println("   " + a[i]);
			}
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch( InputMismatchException ime) {
			System.out.println("Bad input!");
			ime.printStackTrace();
		} catch( ArithmeticException ae) {
			System.out.println("Problem with arithmetic!");
			ae.printStackTrace();
		} catch( IndexOutOfBoundsException ie) {
			System.out.println("Problem with array index!");
			ie.printStackTrace();
		} catch( Exception e) {
			System.out.println("Exception caught!");
			e.printStackTrace();
		} finally {
			infile.close();
			input.close();
			System.out.println("infile closed");
		}		
	}
}