package edu.uwex.apc390.lesson4_3;

public class Start2 {

	public static void main(String[] args) {
		Shape[] sList = new Shape[10];
		sList[0] = new Circle(2);		sList[1] = new Rectangle(2,3);
		sList[2] = new Circle(15);		sList[3] = new Rectangle(3,2);
		sList[4] = new Circle(4);		sList[5] = new Rectangle(4,3);
		sList[6] = new Circle(10);		sList[7] = new Rectangle(2,12);
		sList[8] = new Circle(3);		sList[9] = new Rectangle(21,4);
		for (Shape s : sList)
			System.out.println("Area of " + s + " is " + s.area() );
	}

}
