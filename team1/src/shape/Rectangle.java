package shape;

public class Rectangle {

	private double height;
	private double width;

	public Rectangle(double height, double width) {
		this.width = width;
		this.height = height;
	}

	/*
	 * public void setDimension(double width,double height){ this.width=width;
	 * this.height=height;
	 * 
	 * }
	 */

	public void draw() {
		System.out.println("Dimension - " + width + "*" + height);
		System.out.println("Area - " + width * height);

	}
}
