package edu.uwex.apc390.lesson10_1;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * MyWindow2 - Review: create a Window class that extends JFrame,
 *             - Get the ContentPane and add a layout
 *             - Add components: JTextFields, JLabels, JButtons
 *             - Basic event - respond to events from button click
 *          - Refactor MyWindow1 to have a private inner Listener class
 * @author Anthony Varghese
 *
 */
public class MyWindow2 extends JFrame {
	/**
	 * Data members
	 */
	private static final long serialVersionUID = 1L;
	private static final int WINDOW_WIDTH  = 500;
	private static final int WINDOW_HEIGHT = 150;
	private static final int GRIDCOLS = 3;
	private static final int GRIDROWS = 3;

	public MyWindow2() {
		setTitle("APC 390 Lesson 10 - GUI - MyWindow2");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		addComponents();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible( true );	
	}
	
	
	private void addComponents() {
		Container pane = this.getContentPane();
		pane.setLayout( new GridLayout( GRIDROWS, GRIDCOLS ) );
		
		JLabel label1 = new JLabel("Enter your first name:");
		JLabel label2 = new JLabel("Enter your last name:");
		JLabel label3 = new JLabel("");
		pane.add(label1);
		pane.add(label2);
		pane.add(label3);
		
		JTextField fnameTextField = new JTextField(15);
		JTextField lnameTextField = new JTextField(15);
		JLabel result = new JLabel("");
		pane.add(fnameTextField);
		pane.add(lnameTextField);
		pane.add(result);
		
		JButton quit = new JButton("Quit!");
		quit.setBackground( Color.RED );
		JLabel  blank = new JLabel("");
		JButton concat = new JButton("Full name");
		concat.setBackground( Color.GREEN );
		pane.add(quit);
		pane.add(blank);
		pane.add(concat);
		
		quit.addActionListener( new QuitButtonListener() );
	}
	
	/**
	 * QuitButtonListener - private inner class in MyWindow2 
	 *                    - Used to respond to button clicks of the Quit JButton
	 *                      The part that is actually used is the actionPerformed method
	 * @author Anthony Varghese
	 */
	private class QuitButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Quit button clicked! Exiting!");
			System.exit(0);
		}			
	}
	
	
	/**
	 * main method - program starts here.
	 * @param args
	 */
	public static void main(String[] args) {
		MyWindow2 window = new MyWindow2();
	}
}