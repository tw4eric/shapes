package com.ericsson.scd;

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