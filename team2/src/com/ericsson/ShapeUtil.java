package com.ericsson;

public class ShapeUtil{
    public static void main(String a[]){
        
        int initialWidth = 5;
        int initialHeight = 7;
        
        for( int i=0; i<5; i++){
            Shape r = ShapeFactory.createRectange(initialWidth, initialHeight);
            r.draw();
            
            initialWidth ++;
            initialHeight ++;
        }
     
        int radius = 5;
        for(int i=0; i<5; i++)
        {
            Shape s = ShapeFactory.createCircle(radius);
            s.draw();
            
            radius ++;
        }
        
        int length = 6;
        for(int i=0; i<5; i++){
            Shape s  = ShapeFactory.createSquare(length);
            s.draw();
            
            length++;
        }
    }
}


