package edu.uwex.apc390.lesson4_2;

public class Circle {
	private float radius;
	public Circle(float rad) { radius = rad; }
	public float area() { return (float) Math.PI * radius * radius; }
	public String toString() { return "Circle with radius " + radius; }
}
