package edu.uwex.apc390.lesson2_1;

public class Role {
	private String name;
	public Role( String n){
		name = n;
	}
	@Override
	public String toString() {
		return "Role [name=" + name + "]";
	}
}
