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
	    if (height <= 0 || width <= 0)
	    {
	        throw new IllegalArgumentException("Invalid arguments");
	    }
		this.width = width;
		this.height = height;
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
