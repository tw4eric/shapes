package com.ericsson.agileTraining.examples;

public class Square implements Shape
{
    private float mySide;
    
    public Square(float side)
    {
        mySide = side;
    }
    
    public void setSide(float aSide)
    {
        mySide = aSide;
    }
    
    public float getSide()
    {
        return mySide;
    }
    
    @Override
    public void printDimensions()
    {
        System.out.println("\n");
        System.out.println("Dimensions of the Rectangle");
        System.out.println("Side = " + mySide);        
    }

    @Override
    public void printArea()
    {
        System.out.println("Area = " + (mySide * mySide) + " sq units");
        
    }

}
