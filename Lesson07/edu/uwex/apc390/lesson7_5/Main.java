package edu.uwex.apc390.lesson7_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	private static final String outfile = "outputfile.obj";
	public static void main(String[] args) {
		Person person1 = new Person("Penny", "Green Bay");
		
		try {
			writeToFile( outfile, person1 );
		} catch (IOException ioe) {
			System.out.println("Exception while writing object!");
		}
	    

		try {
			Person fromFile = readFromFile( outfile );
			fromFile.display( " was read from a file!" );
		} catch (IOException ioe) {
			System.out.println("Exception while reading object from file!");
		}
	}

	private static void writeToFile(String file, Person p)  throws IOException{
		FileOutputStream fos   = new FileOutputStream( file );
	    ObjectOutputStream oos = new ObjectOutputStream(fos);

	    oos.writeObject( p );
	    oos.close();		
	}

	private static Person readFromFile(String file) throws IOException {
		FileInputStream   fis = new FileInputStream( file );
	    ObjectInputStream ois = new ObjectInputStream(fis);

	    Person read = null;
	    try {
			read = (Person) ois.readObject();
		} catch (ClassNotFoundException e) {
			System.err.println(" Exception caught while trying to read person object.");
		} finally {
			ois.close();		
		}
		return read;
	}

}
