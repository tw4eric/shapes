package com.ericsson.agileTraining.examples;

public class Circle implements Shape
{
    private float myRadius;
    
    public void setRadius(float aRadius)
    {
        myRadius = aRadius;
    }
    
    public float getRadius()
    {
        return myRadius;
    }
    
    public void printDimensions()
    {
        System.out.println("Dimensions of the Circle");
        System.out.println("Radius = " + myRadius);
        
    }
    
    public void printArea()
    {
        System.out.println("Area = " + (3.14 * myRadius * myRadius) + " sq units");
    }
}
