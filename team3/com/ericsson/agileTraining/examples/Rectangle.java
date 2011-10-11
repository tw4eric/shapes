package com.ericsson.agileTraining.examples;

public class Rectangle
{
    private float myLength;
    
    private float myBreadth;
    
    public Rectangle(float aLength, float aBreadth)
    {
        myLength = aLength;
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
