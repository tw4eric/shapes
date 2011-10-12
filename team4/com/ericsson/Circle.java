package com.ericsson;

public class Circle implements Shape {

	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public Circle(double radius) {
		if (radius < 0) {
			throw new RuntimeException(
					"Radius of a circle should be greater than or equal to zero.");
		}
		this.radius = radius;
	}
	
	@Override
	public void draw(Bitmap bitmap) {
	    
		bitmap.draw("Radius of the circle: "+ getRadius());
		bitmap.draw("Area of the circle: " + getArea());
		
	}

	public double getArea() {
		return 3.1415 * getRadius() * getRadius();
	}

}
