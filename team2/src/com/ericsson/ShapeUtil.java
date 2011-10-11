package com.ericsson;

public class ShapeUtil{
    public static void main(String a[]){
        
        int initialWidth = 5;
        int initialHeight = 7;
        
        for( int i=0; i<5; i++){
            Rectangle r = new Rectangle(initialWidth, initialHeight);
            r.draw();
            
            initialWidth ++;
            initialHeight ++;
        }
        
    }
}


