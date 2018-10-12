package edu.uwex.apc390.lesson2_3;

public class Role {
	private String name;
	private Actor  actor;
	private int    startseason;
	public Role( String n, String a, int start){
		name = n;
		actor = new Actor( a );
		startseason = start;
	}
	@Override
	public String toString() {
		return "Role [name=" + name + ", " + startseason + " " + actor +  "]";
	}
}
