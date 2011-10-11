package com.ericsson;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeProducer
{
    public List<Shape> getShapes(){
        int width  = new Random().nextInt(10);
        int height = new Random().nextInt(10);
        float flWidth = new Random().nextFloat();
        
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(ShapeFactory.createCircle(flWidth));
        shapes.add(ShapeFactory.createRectange(width, height));
        shapes.add(ShapeFactory.createSquare(width));
        
        return shapes;
    }
    
    public List<Shape> produceShapes(){
        List<Shape> allShapes = getShapes();
        for(Shape s : allShapes){
            s.draw();
        }
        
        return allShapes;
    }
}
