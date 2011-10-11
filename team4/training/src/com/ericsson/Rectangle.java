package com.ericsson;

public class Rectangle implements Shape {

	protected double height;
	protected double width;

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public Rectangle(double height, double width) {
		if (height <= 0 || width <= 0) {
			throw new RuntimeException(
					"Height and width of a "+this.getClass().getSimpleName()+" should be greater than zero.");
		}
		this.height = height;
		this.width = width;
	}

	public void draw() {
		System.out.println("The height of the "+this.getClass().getSimpleName()+": " + getHeight());
		System.out.println("The width of the "+this.getClass().getSimpleName()+": " + getWidth());
		System.out.println("The area of the "+this.getClass().getSimpleName()+": " + getArea());
		System.out.println("---------------------------------");
	}
	
	public double getArea() {
		return getHeight() * getWidth();
	}

}
