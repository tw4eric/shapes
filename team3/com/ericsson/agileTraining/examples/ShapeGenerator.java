package com.ericsson.agileTraining.examples;

public class ShapeGenerator
{

    public static void main(String[] args)
    {
        Rectangle theR1 = new Rectangle(10.5f,5.8f);
        theR1.printDimensions();
        theR1.printArea();
        
        Circle theCircle1 = new Circle(5);
        theCircle1.printDimensions();
        theCircle1.printArea();
        
        Square theSquare = new Square(8);
        theSquare.printDimensions();
        theSquare.printArea();
  
        
    }
}

