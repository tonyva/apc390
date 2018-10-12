package edu.uwex.apc390.lesson12_1;

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
 * MyWindow - Extends JFrame, add a layout to content pane
 *             - Add components: JTextFields, JLabels, JButtons
 *             - Event handling: respond to events from button clicks
 *                  - a method-local Listener class
 *                  - Lambda to do the same thing
 */
public class MyWindow extends JFrame {
	/**
	 * Data members
	 */
	private static final long serialVersionUID = 1L;
	private static final int WINDOW_WIDTH  = 500;
	private static final int WINDOW_HEIGHT = 150;
	private static final int GRIDCOLS = 3;
	private static final int GRIDROWS = 3;

	public MyWindow() {
		setTitle("APC 390 Lesson 10 - GUI - MyWindow3");
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
		JLabel result = new JLabel("", JLabel.CENTER);
		pane.add(fnameTextField);
		pane.add(lnameTextField);
		pane.add(result);
		
		JButton concat1 = new JButton("Full name");
		concat1.setBackground( Color.GRAY );
		pane.add(concat1);
		JButton concat2 = new JButton("Full name");
		concat2.setBackground( Color.ORANGE );
		pane.add(concat2);
		JLabel result2 = new JLabel("", JLabel.CENTER);
		pane.add(result2);

		/**
		 * ConcatButtonListener - class used inside the addComponents method in MyWindow
		 *                    - Used to respond to button clicks of the Concat JButton
		 *                      The part that is actually used is the actionPerformed method
		 * @author Anthony Varghese
		 */
		class ConcatButtonListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				String fullname = fnameTextField.getText() + " " + lnameTextField.getText();
				// System.out.println( "Full name is " + fullname );
				result.setText( fullname );
			}			
		}
		ConcatButtonListener cbl = new ConcatButtonListener();
		concat1.addActionListener( cbl );
		
		// The next line uses a lambda to do the same things as above
		concat2.addActionListener( e -> result2.setText( fnameTextField.getText() + " " + lnameTextField.getText() ) );
		
	}
	
	
	
	/**
	 * main method - program starts here.
	 * @param args
	 */
	public static void main(String[] args) {
		new MyWindow();
	}
}