package edu.uwex.apc390.lesson2_1;

public class Actor {
	private String name;
	public Actor( String n){
		name = n;
	}
	@Override
	public String toString() {
		return "Actor [name=" + name + "]";
	}
}
