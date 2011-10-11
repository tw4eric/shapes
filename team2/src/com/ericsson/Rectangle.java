package com.ericsson;

public class Rectangle
{

    private int width;
    private int height;
    
    public Rectangle(int width, int height)
    {
        this.width  = width;
        this.height = height;
    }
    
    public void draw()
    {
        System.out.println("Rectangle dimensions drawn.");
        System.out.println("Width: " + width + ", Height: " + height);
        System.out.println("Total area: "  + (width * height));
        System.out.println();
    }

}
