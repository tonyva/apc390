package edu.uwex.apc390.lesson4_2;

public class Rectangle {
	private float length, width;
	public Rectangle(float l, float w) { length = l; width = w; }
	public float area() { return length * width; }
	public String toString() { return "Rectangle with sides " + length + ", " + width; }
}
