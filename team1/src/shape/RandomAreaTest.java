package shape;

public class RandomAreaTest {

	public void printArea(int num) {
		for (int i = 0; i < num; i++) {
			double height = Math.random();
			System.out.println(height);
			double width = Math.random();
			System.out.println(width);

			Shape s1 = new Rectangle(height, width);
			s1.draw();

			Shape s2 = new Circle(height);
			s2.draw();

			Shape s3 = new Square(height);
			s3.draw();
		}
		// Rectangle rectangle = new Rectangle(height, width);
		// rectangle.draw();
		// }
	}

	public static void main(String[] args) {
		RandomAreaTest rat = new RandomAreaTest();
		rat.printArea(1);
	}
}
