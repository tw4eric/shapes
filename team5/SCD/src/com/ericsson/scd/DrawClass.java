package com.ericsson.scd;

interface Shape{
	int AREA_LIMIT=5;
	public void draw();
	public void drawSelective();
}
class Rectangle implements Shape{
	private int length;
	private int breadth;
	public Rectangle(int length, int breadth) {
		// TODO Auto-generated constructor stub
this.length = length;
this.breadth = breadth;
	}
	public void draw(){
		System.out.println("------Rectangle");
		System.out.println("The Length is :"+this.length);
		System.out.println("The Breadth is  :"+this.breadth);
		System.out.println("The Area is :"+(this.length * this.breadth));
		System.out.println();
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	@Override
	public void drawSelective() {
		// TODO Auto-generated method stub
	if((this.length * this.breadth) > AREA_LIMIT){
		draw();
	}
	}
}

class Circle implements Shape{
	private double radius;
	
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
this.radius = radius;

	}
	public void draw(){
		System.out.println("------Circle");
		System.out.println("The Radius is :"+this.radius);
	
		System.out.println("The Area is :"+Math.pow(this.radius,2) * (22/7));
		System.out.println();
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public void drawSelective() {
		// TODO Auto-generated method stub
		if((Math.pow(this.radius,2) * (22/7)) > AREA_LIMIT){
			draw();
		}	
	}
}
class Square implements Shape{
	private double side;	
	public Square(double side) {
		// TODO Auto-generated constructor stub
this.side = side;

	}
	public void draw(){
		System.out.println("------square");
		System.out.println("The side is :"+this.side);
	
		System.out.println("The Area is :"+Math.pow(this.side,2) );
		System.out.println();
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public void drawSelective() {
		// TODO Auto-generated method stub
		if(Math.pow(this.side,2)  > AREA_LIMIT){
			draw();
		}	
}
}

public class DrawClass {

	public void getAllShapes(){
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
	
	public void getSelectiveShapes(){
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
		DrawClass d2 = new DrawClass();
		d1.getAllShapes();
		d2.getSelectiveShapes();
	}
	}	
	
	

