package com.ericsson.agileTraining.examples;

public class Circle implements Shape
{
    private float myRadius;
    
    public Circle(float radius)
    {
        myRadius = radius;
    }
    
    
    public void setRadius(float aRadius)
    {
        myRadius = aRadius;
    }
    
    public float getRadius()
    {
        return myRadius;
    }
    
    public void render()
    {
        System.out.println("\n");
        System.out.println("Dimensions of the Circle");
        System.out.println("Radius = " + myRadius);
        
    }
    
    public double computeArea()
    {
        return (3.14 * myRadius * myRadius);
    }
}
