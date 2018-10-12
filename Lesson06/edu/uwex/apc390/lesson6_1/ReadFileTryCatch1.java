package edu.uwex.apc390.lesson6_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileTryCatch1 {
	public static void main(String[] args) {
		try {
			FileReader infile = new FileReader("src/inputfile.txt");
			Scanner input = new Scanner(infile);
			int n = input.nextInt();
			System.out.println("Number read from the file was: " + n);
		} catch (FileNotFoundException f) {
			// This part will appear as black text in the Console:
			System.out.println("Caught a FileNotFoundException. The cause was: " + f.getCause() );
			System.out.println("   The message was: " + f.getMessage() );
			// This part will appear as red text in the Console:
			System.err.println("   Here is the stack trace:");
			f.printStackTrace();
		} finally {
			// Cannot do this because infile is not visible.
			//   infile.close();
		}
	}
}
