package com.ericsson;


public class Circle implements Shape {
private double radius;
public Circle(double radius) {
	if(radius<0)
		throw new IllegalArgumentException();
	this.radius = radius;
}
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return (3.14 * radius * radius);
	}

	@Override
	public void render(Bitmap bitmap) {
		// TODO Auto-generated method stub
		   bitmap.renderDimensionsAsText("Circlie Dimension is : "+radius);
	       bitmap.renderAreaAsText("Circle Area is :"+computeArea());
	     
	}

}
