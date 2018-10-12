package edu.uwex.apc390.lesson2_2;

public class Role {
	private String name;
	private Actor  actor;
	private int    startseason;
	public Role( String n, Actor a, int start){
		name = n;
		actor = a;
		startseason = start;
	}
	@Override
	public String toString() {
		return "Role [name=" + name + ", " + startseason + " " + actor +  "]";
	}
}
