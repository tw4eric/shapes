package com.ericsson;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

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
	       Bitmap mock = Mockito.mock(Bitmap.class);
	       Rectangle rec = new Rectangle(10,20);
	       rec.draw(mock);
	       
	       Mockito.verify(mock).draw("The height of the Rectangle: 10.0");
	}
    
	@Test	
	public void shouldComputeAreaCorrectly()
	{
        Rectangle rec = new Rectangle(10,20);
        assertEquals((rec.height * rec.width),rec.getArea(),0.00);
	}
}
