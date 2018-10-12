package edu.uwex.apc390.lesson4_4;

public class GetClassOfPolymorphicVariables {
	public static void main(String[] args) {
		class A{}
		class B extends A{}
		class C extends A{}

		A e = new A();
		B f = new B();
		A g = new B();
		A h = new C();
		C i = new C();
		B k = null;
		
		// Let's check the types of objects that the variables refer to.
		System.out.println("     getClass");
		System.out.println("A e    " + e.getClass().getSimpleName());
		System.out.println("B f    " + f.getClass().getSimpleName());
		System.out.println("A g    " + g.getClass().getSimpleName());
		System.out.println("A h    " + h.getClass().getSimpleName());
		System.out.println("C i    " + i.getClass().getSimpleName());
	}
}
