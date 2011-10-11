package shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape s1 = new Rectangle(10, 5);
		s1.draw();

		Shape r1 = new Rectangle(10.5, 5.5);
		r1.draw();

		Shape c1 = new Circle(10);
		c1.draw();
		
		Shape sq1 = new Square(15);
		sq1.draw();

		// for (int i = 0; i < 5; i++) {
		// double height = Math.random();
		// height = height * 100;
		// System.out.println(height);
		// double width = Math.random();
		// width = width * 50;
		// System.out.println(width);

		// Rectangle rectangle = new Rectangle(height, width);
		// rectangle.draw();
		// }

	}

}
