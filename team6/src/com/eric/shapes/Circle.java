package com.eric.shapes;

/*class Circle {
 static void genCircle() {
 double radius = 1 + Math.random() * 10;
 System.out.println("radius  " + radius);
 System.out.println("area  " + 3.14 * radius * radius);
 }

 }*/

public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		if (radius == 0) {
			throw new IllegalArgumentException("The radius cannot be zero");
		}

		if (radius < 0) {
			throw new IllegalArgumentException("The radius cannot be negative");
		}
		return Math.PI * radius * radius;
	}

}
