package edu.uwex.apc390.lesson5_3;

public class Rectangle extends Shape {
	private final float length, width;
	public Rectangle(float l, float w) {
		length = l; 
		width = w;
		computeArea();
	}
	public String toString() {
		return "Rectangle with sides " + length + ", " + width; 
	}
	@Override
	protected void computeArea() {
		area = length * width;
	}

}
