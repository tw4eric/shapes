package shape;

public class Rectangle implements Shape{

	private double height;
	private double width;

	public Rectangle(double height, double width) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle draw : " + width * height);

	}
}
