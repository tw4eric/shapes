package com.ericsson;

public class PrintShapes {
	
	public static void main(String[] args) {
		
		PrintShapes printShapes = new PrintShapes();
		for(int shapeNo = 1; shapeNo < 4; shapeNo++)
		{
			for(int noOfShapes = 0; noOfShapes < 5; noOfShapes++)
			{
				printShapes.getShape(shapeNo).draw();
			}
		}
		
		
	}
	
	public Shape getShape(int number){
		Shape shape = null;
		switch (number) {
		case 1:
			shape = new Rectangle(Math.random(), Math.random());
			break;
		case 2:
			shape = new Square(Math.random());
			break;
		default:
			shape = new Circle(Math.random());
			break;
		}
		return shape;
	}

}
