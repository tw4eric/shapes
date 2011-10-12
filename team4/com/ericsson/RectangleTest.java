package com.ericsson;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest{

	@Test (expected = IllegalArgumentException.class)
	public void dimensionsShouldBeNonNegative(){
	    
       Rectangle rec = new Rectangle(-10,-20);
       
	}

	@Test (expected = IllegalArgumentException.class)
    public void dimensionsShouldBeNonZero(){
        
       Rectangle rec = new Rectangle(10,0);
       
    }
	
	@Test
	public void shouldBeAbleToDraw()
	{
	       Rectangle rec = new Rectangle(10,20);
	       rec.draw();
	}
    
	@Test	
	public void shouldComputeAreaCorrectly()
	{
        Rectangle rec = new Rectangle(10,20);
        assertEquals((rec.getHeight() * rec.getWidth()),rec.getArea(),0.00);
	}
}
