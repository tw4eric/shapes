package com.ericsson.scd;

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