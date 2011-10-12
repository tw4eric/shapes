package com.ericsson.agileTraining.examples;

public class Circle implements Shape
{
    private double myRadius;
    
    public Circle(double radius)
    {
        myRadius = radius;
    }

    public void render(Bitmap bitmap)
    {
        bitmap.renderDimension("Dimension: Radius is " + myRadius);
        bitmap.renderArea("Area: " + computeArea());
    }
    
    public double computeArea()
    {
        return (3.14 * myRadius * myRadius);
    }
}
