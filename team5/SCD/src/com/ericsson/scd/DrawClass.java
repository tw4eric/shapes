package com.ericsson.scd;

class Rectangle{
	private int length;
	private int breadth;
	public Rectangle(int length, int breadth) {
		// TODO Auto-generated constructor stub
this.length = length;
this.breadth = breadth;
	}
	public void draw(){
		System.out.println("------");
		System.out.println("The Length is :"+this.length);
		System.out.println("The Breadth is  :"+this.breadth);
		System.out.println("The Area is :"+(this.length * this.breadth));
		System.out.println();
	}
}

public class DrawClass {
	public static void main(String[] args) {
		for(int i=1;i<=20;i++){
		int length = 10+i;
		int breadth = 30-i;
			Rectangle rect = new Rectangle(length, breadth);
			rect.draw();
		}	
	}
	
}
