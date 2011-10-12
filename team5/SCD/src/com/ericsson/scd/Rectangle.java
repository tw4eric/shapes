package com.ericsson.scd;

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