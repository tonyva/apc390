package edu.uwex.apc390.lesson4_3;

public class Circle extends Shape {
	private float radius;
	public Circle(float rad) { radius = rad; }
	public float area() { return (float) Math.PI * radius * radius; }
	public String toString() { return "Circle with radius " + radius; }
}
