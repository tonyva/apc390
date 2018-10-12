package edu.uwex.apc390.lesson4_2;

public class Start1 {
	public static void main(String[] args) {
		Circle[] cList = new Circle[5]; Rectangle[] rList = new Rectangle[5];
		cList[0] = new Circle(2);		rList[0] = new Rectangle(2,3);
		cList[1] = new Circle(15);		rList[1] = new Rectangle(3,2);
		cList[2] = new Circle(4);		rList[2] = new Rectangle(4,3);
		cList[3] = new Circle(10);		rList[3] = new Rectangle(2,12);
		cList[4] = new Circle(3);		rList[4] = new Rectangle(21,4);
		for (Circle c : cList)
			System.out.println("Area of " + c + " is " + c.area() );
		for (Rectangle r : rList)
			System.out.println("Area of " + r + " is " + r.area() );
	}
}