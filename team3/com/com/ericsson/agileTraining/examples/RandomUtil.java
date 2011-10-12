package com.ericsson.agileTraining.examples;


import java.util.ArrayList;
import java.util.Random;

public class RandomUtil
{
    private static ArrayList<Shape> theShapeList = new ArrayList<Shape>(); 
    
    public static void main(String...args)
    {
        
        
        Random randomGenerator = new Random();
        
        for (int idx = 1; idx <= 5; ++idx)
        {
            int randomInt = randomGenerator.nextInt(10);
            Shape theRect = new Rectangle(randomInt, randomInt);
            Shape theSQUARE = new Square(randomInt);
            Shape theCIRCLE = new Circle(randomInt);
            theShapeList.add(theRect);
            theShapeList.add(theSQUARE);
            theShapeList.add(theCIRCLE);
            
        } 
        getData();
        

    }
    
    public static void getData()
    {
        for (Shape aShape : theShapeList)
        {
            aShape.render(null);
            aShape.computeArea();
        }
    }
    
    

    


}
