public class CreateObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and create a point object and two rectangle objects.
		
		Point origineOne = new Point(23, 94);
		Rectangle rectOne = new Rectangle(origineOne, 100, 200);
		Rectangle rectTwo = new Rectangle(50, 100);
		Rectangle rectThree = new Rectangle();
		int a = 0;
		int b = 0;
		
		// display rectOne's width, height, and area
		
		System.out.println("Width of rectOne is: " + rectOne.width);
		System.out.println("Height of rectOne is: " + rectOne.height);
		System.out.println("Area of rectOne is: " + rectOne.getArea());
		
		// set rectTwo's position
		rectTwo.origin = origineOne;
		
		// display rectTwo's position
		System.out.println("X for recTwo's position is: " + rectTwo.origin.x);
		System.out.println("Y for recTwo's position is: " + rectTwo.origin.y);
		
		// move rectTwo and display its new position
		
		rectTwo.move(40, 72);
		System.out.println("X for recTwo's position is: " + rectTwo.origin.x);
		System.out.println("Y for recTwo's position is: " + rectTwo.origin.y);
		System.out.println("Y for recThree's position is: " + rectThree.origin.y);
		
		System.out.println("Area of a rectangle with width = 100 and height = 50 is: " + new Rectangle(100, 50).getArea());
		a = ++b;
		System.out.println("a = " + a);
		System.out.println("b= " + b);
	}

}
