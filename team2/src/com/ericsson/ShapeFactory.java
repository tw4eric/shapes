package com.ericsson;

public class ShapeFactory
{
    public static Shape createRectange(int width, int height){
        return new Rectangle(width, height);
    }
    
    public static Shape createCircle(int radius){
        return new Circle(radius);
    }
}
