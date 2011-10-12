package com.ericsson;

public class PrintFilteredShapes extends PrintShapes {
	
	public static void main(String[] args) {
		
		PrintFilteredShapes printShapes = new PrintFilteredShapes();
		for(int shapeNo = 1; shapeNo < 4; shapeNo++)
		{
			for(int noOfShapes = 0; noOfShapes < 5; noOfShapes++)
			{
				Shape aShape = printShapes.getShape(shapeNo);
				if(aShape.getArea() > 1.0)
				{
					aShape.draw();
				}
			}
		}
		
		
	}
	
	

}
