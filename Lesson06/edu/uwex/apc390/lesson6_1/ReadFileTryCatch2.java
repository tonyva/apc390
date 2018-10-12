package edu.uwex.apc390.lesson6_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileTryCatch2 {
	private static final String filename = "src/inputfile.txt";
	
	public static void main(String[] args) throws IOException {
		FileReader infile = null; // declare here for larger scope and visibility in the finally block.
		Scanner input = null;
		try {
			infile = new FileReader(filename);
			System.out.println("File " + filename + " opened.");

			input = new Scanner(infile);
			int n = input.nextInt();
			System.out.println("   Number read from the file was: " + n);
		} catch (FileNotFoundException f) {
			// This part will appear as black text in the Console:
			System.out.println("Caught a FileNotFoundException. The cause was: " + f.getCause() );
			System.out.println("   The message was: " + f.getMessage() );
			// This part will appear as red text in the Console:
			System.err.println("   Here is the stack trace:");
			f.printStackTrace();
		} finally {
			infile.close(); // With input declared outside try, this works!
			input.close();
			System.out.println("infile closed");
		}
	}
}
