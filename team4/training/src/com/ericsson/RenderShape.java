package com.ericsson;

public class RenderShape {

	public static void main(String[] args) {
		Shape rectangle1 = new Rectangle(10, 20);
		Shape rectangle2 = new Rectangle(5.0, 10.5);
		Shape rectangle3 = new Rectangle(3, 25.6);

		rectangle1.draw();
		rectangle2.draw();
		rectangle3.draw();
		
		//new Rectangle(-3, 25.6);
	}

}
