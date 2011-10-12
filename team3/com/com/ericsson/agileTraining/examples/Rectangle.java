package com.ericsson.agileTraining.examples;

public class Rectangle implements Shape
{
    private double myLength;
    
	private double myBreadth;
    
    public Rectangle(double length, double breadth)
    {
        this.myLength = length;
        this.myBreadth = breadth;
    }

    public double getLength() {
		return myLength;
	}

	@Override
	public void render(Bitmap bitmap) {
		bitmap.renderDimension("Dimension: length is "+myLength+", breadth is " + myBreadth);
		bitmap.renderArea("Area: " + computeArea());
	}

	@Override
	public double computeArea() {
		return (myLength * myBreadth);
	}   
    
}
