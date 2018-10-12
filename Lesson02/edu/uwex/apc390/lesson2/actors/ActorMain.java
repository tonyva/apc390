package edu.uwex.apc390.lesson2.actors;
import java.io.PrintStream;

public class ActorMain {
	static PrintStream syso = System.out;
	public static void main(String[] args) {
		int seasonf = 1;
		Actor a1 = new Actor("Amy Poehler", 25 );
		Actor a2 = new Actor("Nick Offerman", 40 );
		int season2 = 2;
		Actor a3 = new Actor("Adam Scott", 30 );

		syso.println( "Season " + seasonf + ": " + a1);
		syso.println( "Season " + seasonf + ": " + a2);
		syso.println( "Season " + season2 + ": " + a3);
		
		// a2.setName( null );
		syso.println();
		syso.println( "Actor 2:  " + a2);
		// a3.setAge(-100);
		syso.println( "Actor 3:  " + a3);
	}

}
