package com.ericsson;

public class Circle implements Shape
{

    private float radius;
    
    public Circle(float radius){
        this.radius = radius;
    }
    
    @Override
    public void draw()
    {
        System.out.println("Circle dimesions drawn");
        System.out.println("Circle radius: " + radius);
        System.out.println("Area: " + ( 3.14f * (radius * radius)));
        System.out.println();
    }

}
