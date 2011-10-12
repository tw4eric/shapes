package test;

import shape.Rectangle;
import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RectangleTest 
{
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowErrorOnNegativeOrZeroInput()
	{
		Rectangle rectangle=new Rectangle(-1,-1);
		
	}
	
	@Test
	public void shouldCalculateAreaAsLengthIntoBreadth()
	{
		Rectangle rectangle=new Rectangle(10,5);
		Assert.assertEquals(10.0*5.0, rectangle.computeArea(), 0.0001);
	}
}
