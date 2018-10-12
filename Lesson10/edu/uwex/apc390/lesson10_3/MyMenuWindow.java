package edu.uwex.apc390.lesson10_3;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


/**
 * @author Anthony Varghese
 *
 */
public class MyMenuWindow extends JFrame implements ActionListener, MenuListener {
	/**
	 * Data members
	 */
	private static final long serialVersionUID = 1L;
	private static final String TITLE = "APC 390 - Lesson 10 - MyMenuWindow";
	private static final int WINDOW_WIDTH  = 400;
	private static final int WINDOW_HEIGHT = 300;
	
	// Menu system
	private JMenuBar menuBar = new JMenuBar();
	private static final String FILE  = "File";
	private static final String OPEN  = "Open";
	private static final String SAVE  = "Save";
	private static final String EXIT  = "Exit";
	private static final String EDIT  = "Edit";
	private static final String CUT   = "Cut";
	private static final String COPY  = "Copy";
	private static final String PASTE = "Paste";
	private static final String QUIT  = "Quit";
	private static final String SELECTALL = "Select All";
	// We can use the Strings to access the menus and menu items from these maps:
	private Map<String,JMenu>     menus = new HashMap<>();
	private Map<String,JMenuItem> items = new HashMap<>();
	
	// Text Area
	private JTextArea text = new JTextArea();
	private String clipboard = "";
	private static final String MYDIR = "src/edu/uwex/apc390"; // Starting directory for FileChoosers
	
	
	/**
	 * Default constructor
	 */
	public MyMenuWindow() {
		super( TITLE );
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		addComponents();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible( true );
	}

	private void addComponents() {
		Container pane = this.getContentPane();
		pane.setLayout( new BorderLayout() );
		
		// Add the TextArea and make it scrollable with a JScrollPane
		pane.add( text, BorderLayout.CENTER );
		pane.add( new JScrollPane(text) );
		text.setLineWrap( true );
		
		
		// Add the MenuBar
		setJMenuBar( menuBar );
		
		// Add the Menus
		menus.put(FILE,  new JMenu(FILE));
		menus.put(EDIT,  new JMenu(EDIT));
		menus.put(QUIT,  new JMenu(QUIT));
		// Works but cannot control order:
		//for ( JMenu m : menus.values() )
		//	menuBar.add( m );
		menuBar.add( menus.get( FILE )); // Add the File menu to the menu bar
		menuBar.add( menus.get( EDIT ));
		menuBar.add( menus.get( QUIT ));
		
		// Add the Menu items to the Menus
		items.put(OPEN,  new JMenuItem(OPEN));
		items.put(SAVE,  new JMenuItem(SAVE));
		items.put(EXIT,  new JMenuItem(EXIT));
		items.put(EDIT,  new JMenuItem(EDIT));
		items.put(CUT,   new JMenuItem(CUT));
		items.put(COPY,  new JMenuItem(COPY));
		items.put(PASTE, new JMenuItem(PASTE));
		items.put(SELECTALL, new JMenuItem(SELECTALL));
		menus.get( FILE ).add( items.get(OPEN) );
		menus.get( FILE ).add( items.get(SAVE) );
		menus.get( FILE ).add( items.get(EXIT) );
		menus.get( EDIT ).add( items.get(CUT) );
		menus.get( EDIT ).add( items.get(COPY) );
		menus.get( EDIT ).add( items.get(PASTE) );
		menus.get( EDIT ).add( items.get(SELECTALL) );
		
		// Set this class to be the ActionListener for all the menu items
		for ( JMenuItem m : items.values() )
			m.addActionListener( this );
		menus.get( QUIT ).addMenuListener( this );
	}

	/**
	 *  actionPerformed - handles all menu items.
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem mi = (JMenuItem) e.getSource();
		System.out.println("Event from the menu item: " + mi.getText() );
		if (mi == items.get(EXIT))
			System.exit( 0 );
		else if ( mi == items.get(OPEN) )
			readFile();
		else if ( mi == items.get(SAVE) )
			saveFile();
		else if ( mi == items.get(CUT) ) {
			// save a copy in the clipboard
			clipboard = text.getSelectedText();
			// remove from text
			text.replaceRange( "", text.getSelectionStart(), text.getSelectionEnd());
		} else if ( mi == items.get(COPY) )
			clipboard = text.getSelectedText(); // copy to the clipboard
		else if ( mi == items.get(PASTE) )
			text.insert(clipboard, text.getCaretPosition()); // copy string data from the clipboard
		else if ( mi == items.get(SELECTALL) )
			text.selectAll();
	}

	@Override
	public void menuSelected(MenuEvent e) {
		if (e.getSource().equals(menus.get( QUIT ))) 
			if (JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?") == JOptionPane.OK_OPTION)
				System.exit( 0 );
	}
	@Override
	public void menuDeselected(MenuEvent e) { }
	@Override
	public void menuCanceled(MenuEvent e) {	}

	/**
	 * readFile - read the contents of a file and display it in the text area.
	 */
	private void readFile() {
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory( new File( MYDIR ));
		int returnvalue = fc.showOpenDialog( this );
		if (returnvalue == JFileChooser.APPROVE_OPTION) {
			FileReader reader = null;
            try {
				reader = new FileReader( fc.getSelectedFile() );
				text.read(reader, null );
			} catch (FileNotFoundException e1) {
				System.out.println("Not able to open file!");
				e1.printStackTrace();
			} catch (IOException e1) {
				System.out.println("Not able to read file!");
				e1.printStackTrace();
			} finally {
				if (reader != null)
					try {
						reader.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			}
		}
	}

	/**
	 * saveFile - should take the contents of the text area and save it to a file
	 *          
	 */
	private void saveFile() {
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory( new File( MYDIR ));
		int returnvalue = fc.showSaveDialog( this );
		/*
		 * Code needed here!
		 */
	}
	
	
	/**
	 * main - program starts here.
	 * @param args
	 */
	public static void main(String[] args) {
		new MyMenuWindow();
	}
}