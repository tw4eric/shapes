package com.ericsson;

public class Rectangle implements Shape
{

    private int width;
    private int height;
    private int area;
    
    public Rectangle(int width, int height)
    {
        this.width  = width;
        this.height = height;
    }
    
    public void draw()
    {
        area  = (width * height);
        System.out.println("Rectangle dimensions drawn.");
        System.out.println("Width: " + width + ", Height: " + height);
        System.out.println("Total area: "  + area);
        System.out.println();
    }

    @Override
    public int getArea()
    {
        return area;
        
    }
}
