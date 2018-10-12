package edu.uwex.apc390.lesson6_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader infile = new FileReader("src/inputfile.txt");
		Scanner input = new Scanner( infile );
		
		int n = input.nextInt();
		System.out.println("Number read from the file was: " + n);
	}
}
