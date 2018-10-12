package edu.uwex.apc390.lesson6_5;

public class FloatDivideByZeroException extends ArithmeticException {
	/**
	 * Default serial version number
	 */
	private static final long serialVersionUID = 1L;

	public FloatDivideByZeroException() {
		super("Dividing a float by 0.0f");
	}

	public FloatDivideByZeroException(String s) {
		super(s);
	}

	
}
