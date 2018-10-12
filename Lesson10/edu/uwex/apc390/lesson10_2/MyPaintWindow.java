package edu.uwex.apc390.lesson10_2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * MyPaintWindow - Set up a window with a panel to draw in
 *  
 * @author Anthony Varghese
 *
 */
public class MyPaintWindow extends JFrame {
	/**
	 * Data members
	 */
	private static final long serialVersionUID = 1L;
	private static final int WINDOW_WIDTH  = 500;
	private static final int WINDOW_HEIGHT = 450;
	private static final int PANEL_WIDTH  = WINDOW_WIDTH  -  50;
	private static final int PANEL_HEIGHT = WINDOW_HEIGHT - 150;
	private static final int GRIDCOLS = 4;
	// private static final int GRIDROWS = 3;

	public MyPaintWindow() {
		setTitle("APC 390 Lesson 10 - GUI - MyPaintWindow");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		addComponents();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible( true );	
	}
	
	
	private void addComponents() {
		Container pane = this.getContentPane();
		GridBagLayout layout = new GridBagLayout( );
		pane.setLayout( layout );
		/*
		 * Set up constraints to optimize how the different components appear
		 */
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		
		

		/*
		 * Add the components using the GridBagLayout constraints.
		 * 
		 * In the first (0th) row, all we have is a PaintPanel
		 */
		int row = 0;
		constraints.gridy = row; constraints.gridx = 0; // row 0, col 0
		constraints.gridwidth = GRIDCOLS;
		constraints.gridheight = 1;
		PaintPanel paint = new PaintPanel();
		paint.setPreferredSize( new Dimension(PANEL_WIDTH, PANEL_HEIGHT) );
		paint.setBackground( Color.LIGHT_GRAY );
		pane.add(paint,  constraints);

		/*
		 * Add a label and text field in the second (1) row
		 */
		row++;
		constraints.gridy = row; constraints.gridx = 0; // row 1, col 0
		constraints.gridwidth  = 2;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;                    // take up half the row
		JLabel label = new JLabel("Enter some text: ", JLabel.RIGHT);
		pane.add(label, constraints);
		constraints.gridy = row; constraints.gridx = 2; // row 1, col 2
		JTextField text = new JTextField(15);
		pane.add(text,  constraints);

		/*
		 * Add two more labels and text fields in the third (2) row
		 */
		row++;
		constraints.gridwidth  = 1;		constraints.gridheight = 1;
		constraints.weightx = 0.25;                    // take up a quarter of the row
		constraints.gridy = row; constraints.gridx = 0; // row 2, col 0
		pane.add(new JLabel("x:", JLabel.RIGHT), constraints);
		constraints.gridy = row; constraints.gridx = 1; // row 2, col 1
		JTextField xtext = new JTextField(5);
		pane.add(xtext,  constraints);
		constraints.gridy = row; constraints.gridx = 2; // row 2, col 2
		pane.add(new JLabel("y:", JLabel.RIGHT), constraints);
		constraints.gridy = row; constraints.gridx = 3; // row 2, col 3
		JTextField ytext = new JTextField(15);
		pane.add(ytext,  constraints);

		
		/*
		 * Add a show button as a bar across the fourth (3) row
		 */
		row++;
		constraints.gridy = row; constraints.gridx = 0; // row 3, col 0
		constraints.gridwidth = GRIDCOLS;
		constraints.gridheight = 1;
		JButton go = new JButton("Show my text.");
		go.setBackground( Color.GREEN );
		go.addActionListener( e -> {
				System.out.println("Show button clicked!");
				//Uncomment the next 5 lines to get a list of fonts on your computer.
				//System.out.println("Fonts available are: " + 
				//	Arrays.toString(
				//		GraphicsEnvironment.
				//			getLocalGraphicsEnvironment().
				//				getAvailableFontFamilyNames() ));
				Graphics g = paint.getGraphics();
				int x = Integer.parseInt( xtext.getText() );
				int y = Integer.parseInt( ytext.getText() );
				String s = text.getText();
				//g.setFont( new Font( "Courier", Font.ITALIC, 50 ) );
				//g.setFont( new Font( "Helvetica", Font.BOLD, 100 ) );
				//g.setFont( new Font( "Serif", Font.TRUETYPE_FONT, 75 ) );
				g.setFont( new Font( "Arial", Font.PLAIN, 25 ) );
				//g.setColor( Color.BLACK );
				//g.setColor( Color.BLUE );
				//g.setColor( Color.CYAN );
				//g.setColor( Color.DARK_GRAY );
				//g.setColor( Color.GRAY );
				g.setColor( Color.GREEN );
				//g.setColor( Color.LIGHT_GRAY );
				//g.setColor( Color.MAGENTA );
				//g.setColor( Color.ORANGE );
				//g.setColor( Color.PINK );
				//g.setColor( Color.RED );
				//g.setColor( Color.YELLOW );
				g.drawString( s, x, y);
			});
		pane.add(go,   constraints);

		/*
		 * Add a clear button as a bar across the fifth (4) row
		 */
		row++;
		constraints.gridy = row; constraints.gridx = 0; // row 4, col 0
		constraints.gridwidth = GRIDCOLS;
		constraints.gridheight = 1;
		JButton clear = new JButton("Clear");
		clear.setBackground( Color.LIGHT_GRAY );
		clear.addActionListener( e -> {
				System.out.println("Clear button clicked!");
				paint.repaint();
			});
		pane.add(clear, constraints);

		/*
		 * Add a quit button as a bar across the bottom row
		 */
		row++;
		constraints.gridy = row; constraints.gridx = 0; // row 5, col 0
		constraints.gridwidth = GRIDCOLS;
		constraints.gridheight = 1;
		JButton quit = new JButton("Quit!");
		quit.setBackground( Color.RED );
		quit.addActionListener( e -> {
				System.out.println("Quit button clicked! Exiting!");
				System.exit(0);
			});
		pane.add(quit,   constraints);
	}

	/**
	 * main method - program starts here.
	 * @param args
	 */
	public static void main(String[] args) {
		new MyPaintWindow();
	}
}