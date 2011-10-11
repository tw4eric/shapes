package shape;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 5);
		System.out.println("Integer");
		// r.setDimension(10,5);
		r.draw();

		Rectangle r1 = new Rectangle(10.5, 5.5);
		System.out.println("Double");
		// r.setDimension(12.2,5.5);
		r1.draw();
		
		for(int i=0; i<5; i++){
			double height = Math.random();
			height = height * 100;
			System.out.println(height);
			double width = Math.random();
			width = width * 50;
			System.out.println(width);
			
			Rectangle rectangle = new Rectangle(height, width);
			rectangle.draw();
		}
		
	}

}
