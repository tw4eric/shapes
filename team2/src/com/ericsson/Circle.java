package com.ericsson;

public class Circle implements Shape
{

    private float radius;
    private float area;
    
    public Circle(float radius){
        this.radius = radius;
    }
    
    @Override
    public void draw()
    {
        area = ( 3.14f * (radius * radius));
        System.out.println("Circle dimesions drawn");
        System.out.println("Circle radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println();
    }

    @Override
    public int getArea()
    {
        return (int) area;
        
    }

}
