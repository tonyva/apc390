package edu.uwex.apc390.lesson8_2;

public class IntegerPair {
	private Integer element1;
	private Integer element2;
	
	public IntegerPair(Integer e1, Integer e2) {
		element1 = e1;
		element2 = e2;
	}

	public Integer getElement1() {
		return element1;
	}

	public void setElement1(Integer element1) {
		this.element1 = element1;
	}

	public Integer getElement2() {
		return element2;
	}

	public void setElement2(Integer element2) {
		this.element2 = element2;
	}
	
	public String toString() {
		return "" + element1 + ", " + element2;
	}

}
