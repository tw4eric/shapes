package com.ericsson;

public class Rectangle implements Shape {

	private double height;
	private double width;

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public Rectangle(double height, double width) {
		if (height <= 0 || width <= 0) {
			throw new RuntimeException(
					"Height and width of a rectangle should be greater than zero.");
		}
		this.height = height;
		this.width = width;
	}

	public void draw() {
		System.out.println("The height of the rectangle: " + getHeight());
		System.out.println("The width of the rectangle: " + getWidth());
		System.out.println("The area of the rectangle: "
				+ (getHeight() * getWidth()));
		System.out.println("---------------------------------");
	}

}
