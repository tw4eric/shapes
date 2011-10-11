package com.ericsson.agileTraining.examples;

public class ShapeGenerator
{

    public static void main(String[] args)
    {
        Rectangle theR1 = new Rectangle();
        theR1.setLength(10.5f);
        theR1.setBreadth(5.8f);
        theR1.printDimensions();
        theR1.printArea();
        
        System.out.println("\n");
        Circle theCircle1 = new Circle();
        theCircle1.setRadius(5);
        theCircle1.printDimensions();
        theCircle1.printArea();
    }
}

