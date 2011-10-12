package com.ericsson.agileTraining.examples;

public class Square extends Rectangle
{
    
    public Square(double side)
    {
    	super(side, side);
    }
    
    @Override
    public void render(Bitmap bitmap)
    {
    	bitmap.renderDimension("Dimension: side is "+ getLength());
		bitmap.renderArea("Area: " + computeArea());   
    }

}
