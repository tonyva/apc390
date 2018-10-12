package edu.uwex.apc390.lesson7_2;

/**
 * @author Anthony Varghese
 *
 */
public interface Displayable {
	public static final int DISPLAY_IDENTITY = 102;
	public abstract void display(String s);
	public default void printout(String s) {
		System.out.println( "Displayable: " + DISPLAY_IDENTITY + s );
	}
	private static boolean isValid(int id) {
		return id == DISPLAY_IDENTITY;
	}
	public static boolean isValid(String s, int id) {
		return s != null && isValid(id);
	}
}