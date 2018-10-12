package edu.uwex.apc390.lesson6_3;

import javax.swing.JOptionPane;

public class UncheckedExceptionExample1 {

	public static void main(String[] args) {
		String userInput1 = JOptionPane.showInputDialog("Enter a number");
		String userInput2 = JOptionPane.showInputDialog("Enter another number");
		
		try {
			int number1 = Integer.parseInt( userInput1 );
			int number2 = Integer.parseInt( userInput2 );
			int result  = number1 / number2;
			
			JOptionPane.showMessageDialog(null,
					"You entered: " + number1 + " and " + number2 + 
					"\nThe result of dividing them is: " + result,
					"Result", JOptionPane.INFORMATION_MESSAGE );
		} catch( NumberFormatException ne) {
			System.out.println("Bad input!");
			ne.printStackTrace();
		} catch( ArithmeticException ae) {
			System.out.println("Problem with arithmetic!");
			ae.printStackTrace();
		} catch( Exception e) {
			System.out.println("Exception caught!");
			e.printStackTrace();
		}
		finally {
			System.out.println("Done!");
		}
	}

}
