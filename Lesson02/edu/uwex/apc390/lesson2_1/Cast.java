package edu.uwex.apc390.lesson2_1;
import java.io.PrintStream;

public class Cast {
	static PrintStream syso = System.out;
	public static void main(String[] args) {
		Role  r1 = new Role("Leslie Knope");
		Actor a1 = new Actor("Amy Poehler");
		int seasonf = 1;
		
		Role  r2 = new Role("Ron Swanson");
		Actor a2 = new Actor("Nick Offerman");
		
		int season2 = 2;
		Role  r3 = new Role("Ben Wyatt");
		Actor a3 = new Actor("Adam Scott");

		syso.println(r1 + " " + seasonf + " " + a1);
		syso.println(r2 + " " + seasonf + " " + a2);
		syso.println(r3 + " " + season2 + " " + a3);
	}

}
