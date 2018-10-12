package edu.uwex.apc390.lesson5_1;

public class MyConcreteClass extends MyAbstractClass3 {
	/*
	 * Constructor
	 */
	public MyConcreteClass(final String s) {
		super(s);
	}
	@Override
	public void setName(String s) {
		if (s != null)
			super.name = s;
	}
}
