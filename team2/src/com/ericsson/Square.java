package com.ericsson;

public class Square implements Shape
{
    private int length;
    private int area;
    
    public Square(int length){
        this.length = length;
    }

    @Override
    public void draw()
    {
        area = (length ^ 2);
        System.out.println("Square dimensions drawn");
        System.out.println("Length: " + length);
        System.out.println("Area:" + area);
        System.out.println();
    }
    
    @Override
    public int getArea()
    {
        return area;
        
    }
}
