package com.ericsson.scd;

public class DrawClass {

	public void drawAllShapes(){
		Shape shp=null;
		for(int i=1;i<=5;i++){
		int length = 10+i;
		int breadth = 30-i;
		shp = new Rectangle(length, breadth);
		shp.draw();	
		shp = new Circle(Math.random()*100);
		shp.draw();
		shp = new Square(Math.random()*100);
		shp.draw();
			
		}

	}
	
	public void drawSelectiveShapes(){
		Shape shp=null;
		for(int i=1;i<=5;i++){
		int length = 10+i;
		int breadth = 30-i;
		shp = new Rectangle(length, breadth);
		shp.drawSelective();	
		shp = new Circle(Math.random()*100);
		shp.drawSelective();
		shp = new Square(Math.random()*100);
		shp.drawSelective();
			
		}

	}
	public static void main(String[] args) {
		DrawClass d1 = new DrawClass();
		d1.drawAllShapes();
		d1.drawSelectiveShapes();
	}
	}	
	
	

