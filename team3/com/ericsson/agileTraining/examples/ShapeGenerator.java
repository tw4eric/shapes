package com.ericsson.agileTraining.examples;

import java.util.ArrayList;

public class ShapeGenerator
{

    public static void main(String[] args)
    {
 
        
        Rectangle theR1 = new Rectangle();
        theR1.setLength(10.5f);
        theR1.setBreadth(5.8f);
        theR1.printDimensions();
        theR1.printArea();
        
        Circle theCircle1 = new Circle();
        theCircle1.setRadius(5);
        theCircle1.printDimensions();
        theCircle1.printArea();
        
        Square theSquare = new Square();
        theSquare.setSide(8f);
        theSquare.printDimensions();
        theSquare.printArea();
  
        
    }
}

