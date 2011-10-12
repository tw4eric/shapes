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

	@Override
	public void render() {
		
	}

	@Override
	public double computeArea() {
		return (myLength * myBreadth);
	}   
    
}