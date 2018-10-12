package edu.uwex.apc390.lesson8_2;

public class GenericPair<T> {
	private T element1;
	private T element2;
	
	public GenericPair(T e1, T e2) {
		element1 = e1;
		element2 = e2;
	}

	public T getElement1() {
		return element1;
	}

	public void setElement1(T element1) {
		this.element1 = element1;
	}

	public T getElement2() {
		return element2;
	}

	public void setElement2(T element2) {
		this.element2 = element2;
	}
	
	public String toString() {
		return "" + element1 + ", " + element2;
	}

}
