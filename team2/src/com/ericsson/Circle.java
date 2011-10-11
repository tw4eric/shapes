package com.ericsson;

public class Circle implements Shape
{

    private int radius;
    
    public Circle(int radius){
        this.radius = radius;
    }
    
    @Override
    public void draw()
    {
        System.out.println("Circle dimesions drawn");
        System.out.println("Circle radius: " + radius);
        System.out.println("Area: " + ( 3.14 * (radius ^ 2)));
        System.out.println();
    }

}
