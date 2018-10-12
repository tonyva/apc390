package edu.uwex.apc390.lesson2_2;
import java.io.PrintStream;

public class Cast {
	static PrintStream syso = System.out;
	public static void main(String[] args) {
		Actor a1 = new Actor("Amy Poehler");
		int seasonf = 1;
		Role  r1 = new Role ("Leslie Knope", a1, seasonf);
		
		Actor a2 = new Actor("Nick Offerman");
		Role  r2 = new Role ("Ron Swanson", a2, seasonf);
		
		int season2 = 2;
		Actor a3 = new Actor("Adam Scott");
		Role  r3 = new Role ("Ben Wyatt", a3, season2);

		syso.println(r1);
		syso.println(r2);
		syso.println(r3);
	}

}
