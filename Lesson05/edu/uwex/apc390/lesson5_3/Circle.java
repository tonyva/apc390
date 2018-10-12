package edu.uwex.apc390.lesson5_3;

public class Circle extends Shape {
	private final float radius;
	public Circle(float rad) {
		radius = rad;
		computeArea();
	}
	public String toString() {
		return "Circle with radius " + radius; 
	}
	@Override
	protected void computeArea() {
		area = (float) Math.PI * radius * radius;
	}
}
