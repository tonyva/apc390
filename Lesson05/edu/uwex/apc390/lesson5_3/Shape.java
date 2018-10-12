package edu.uwex.apc390.lesson5_3;

public abstract class Shape {
	protected float area;
	protected abstract void computeArea();
	public float getArea() {
		return area;
	}
}
