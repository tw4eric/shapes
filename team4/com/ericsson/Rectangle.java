package com.ericsson;

public class Rectangle implements Shape {

	protected double height;
	protected double width;

	public Rectangle(double height, double width) {
	    if (height <= 0 || width <= 0)
	    {
	        throw new IllegalArgumentException("Invalid arguments");
	    }
		this.width = width;
		this.height = height;
	}

	public void draw(Bitmap bitmap) {
	    bitmap.draw("The height of the "+this.getClass().getSimpleName()+": " + height);
	    bitmap.draw("The width of the "+this.getClass().getSimpleName()+": " + width);
	    bitmap.draw("The area of the "+this.getClass().getSimpleName()+": " + getArea());
	    bitmap.draw("---------------------------------");
	}
	
	public double getArea() {
		return height * width;
	}

}
