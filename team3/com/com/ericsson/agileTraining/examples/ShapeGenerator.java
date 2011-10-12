package com.ericsson.agileTraining.examples;

public class ShapeGenerator
{

    public static void main(String[] args)
    {
        Rectangle theR1 = new Rectangle(10.5f,5.8f);
        theR1.render(null);
        theR1.computeArea();
        
        Circle theCircle1 = new Circle(5);
        theCircle1.render(null);
        theCircle1.computeArea();
        
        Square theSquare = new Square(8);
        theSquare.render(null);
        theSquare.computeArea();
  
        
    }
}

