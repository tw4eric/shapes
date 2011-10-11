package com.ericsson.agileTraining.examples;

public class Rectangle implements Shape
{
    private float myLength;
    
    private float myBreadth;
    
    public Rectangle(float length, float breadth)
    {
        myLength = length;
        myBreadth = breadth;
    }
    
    public float getLength()
    {
        return myLength;
    }

    public void setLength(float aLength)
    {
        myLength = aLength;
    }

    public float getBreadth()
    {
        return myBreadth;
    }

    public void setBreadth(float aBreadth)
    {
        myBreadth = aBreadth;
    }
    
    public void printDimensions()
    {
        System.out.println("Dimensions of the Rectangle");
        System.out.println("Length = " + myLength + " and Breadth = " + myBreadth);
        
    }
    
    public void printArea()
    {
        System.out.println("Area = " + (myLength * myBreadth) + " sq units");
    }
}
