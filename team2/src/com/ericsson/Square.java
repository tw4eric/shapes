package com.ericsson;

public class Square implements Shape
{
    private int length;
    
    public Square(int length){
        this.length = length;
    }

    @Override
    public void draw()
    {
        System.out.println("Square dimensions drawn");
        System.out.println("Length: " + length);
        System.out.println("Area:" + (length ^ 2));
        System.out.println();
    }
    
    
}
