package edu.uwex.apc390.lesson2_3;
import java.io.PrintStream;

public class Cast {
	static PrintStream syso = System.out;
	public static void main(String[] args) {
		int seasonf = 1;
		Role  r1 = new Role("Leslie Knope", "Amy Poehler",   seasonf);
		Role  r2 = new Role("Ron Swanson",  "Nick Offerman", seasonf);
		int season2 = 2;
		Role  r3 = new Role("Ben Wyatt",    "Adam Scott",    season2);

		syso.println(r1);
		syso.println(r2);
		syso.println(r3);
	}

}
