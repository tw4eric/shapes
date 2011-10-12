package com.ericsson;

import java.util.ArrayList;
import java.util.List;

public class ShapeRenderer {

	public static void main(String[] args)
	{
	    Bitmap bitmap = new Bitmap();
	    ShapeRenderer rs = new ShapeRenderer();
	    rs.printShapes(bitmap);
	    rs.printFilteredShapes(bitmap);
	}
	
	public void printShapes(Bitmap bitmap)
	{
	    for (Shape theShape : generateShapes())
	    {
	        theShape.draw(bitmap);
	    }
	}
	
	public void printFilteredShapes(Bitmap bitmap)
	{
	    for (Shape theShape : generateShapes())
        {
	        if (theShape.getArea() > 5)
	        {
	            theShape.draw(bitmap);
	        }
        }
	}
	
	public List<Shape> generateShapes()
	{
        List<Shape> shapes = new ArrayList<Shape>();
        for(int i=0;i<5;i++)
        {
            int index = (int) (Math.random()*100);
            Shape rectangle1 = new Rectangle(index, index*2);
            Shape square = new Square(index);
            Shape circle = new Circle(index);
            shapes.add(rectangle1);
            shapes.add(square);
            shapes.add(circle);
            
        }
        return shapes;
	}

}
