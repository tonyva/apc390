package edu.uwex.apc390.lesson12_1;

public class LambdaExamples {
	@FunctionalInterface
	interface MyCheck{
		boolean check(int i, int j);
	}
	MyCheck decider;
	
	public LambdaExamples(MyCheck l) {
		decider = l;
	}
	private void checkpoint(int i, int j) {
		if ( decider.check(i, j) )
			System.out.println(" " + i + " and " + j + " are OK!");
		else
			System.out.println(" " + i + " and " + j + " are not OK.");
	}
	
	public static void main(String[] args) {
		oldstyle();
		lambdaex1();
		lambdaex2();

		mylambdaex1();
		mylambdaex2();
		mylambdaex3();
		mylambdaex4();
		mylambdaex5();
	}

	private static void oldstyle() {
		// Old style anonymous Runnable class:
		Runnable oldstyle = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello, this is an old-style thread!");
			}
		};
		Thread t = new Thread( oldstyle );
		t.start();		
	}

	private static void lambdaex1() {
		// Example of a lambda that does not do anything.
		//  This example is to show how lambda syntax works
		Runnable noargnostatements = () -> {};
		// These lambda bodies are equivalent: {}   {;}   {return;} 
		Thread t = new Thread( noargnostatements );
		t.start();
	}

	private static void lambdaex2() {
		// Example of a lambda that prints a message.
		// If the method body is a single Java statement, we don't need curly braces.
		Runnable noarg1statement = () ->  System.out.println("Hello, this is a thread using a lambda!");
		Thread t = new Thread( noarg1statement );
		t.start();
	}

	private static final int a = 10;
	private static final int b = 20;
	
	private static void mylambdaex1() {
		MyCheck oldstyle = new MyCheck() {
			@Override
			public boolean check(int i, int j) {
				return i > j;
			}
		};
		LambdaExamples ex1 = new LambdaExamples( oldstyle );
		ex1.checkpoint( b, a );
	}
	
	private static void mylambdaex2() {
		MyCheck newstyle = (int i, int j) -> { return i > j; } ;
		LambdaExamples ex1 = new LambdaExamples( newstyle );
		ex1.checkpoint( b, a );
	}


	private static void mylambdaex3() {
		MyCheck lam = (i, j) -> i > j ;
		new LambdaExamples( lam ).checkpoint( b, a );
	}
	
	private static void mylambdaex4() {
		MyCheck lam = (i, j) -> i < j ;
		new LambdaExamples( lam ).checkpoint( a, b );
	}

	private static void mylambdaex5() {
		MyCheck lam = (i, j) -> i + j == 100 ;
		new LambdaExamples( lam ).checkpoint( a, b );
	}

}