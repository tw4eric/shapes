package com.ericsson.agileTraining.examples;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

/**
 * The class <code>RectangleTest</code> contains tests for the class {@link
 * <code>Rectangle</code>}
 *
 * @pattern JUnit Test Case
 *
 * @generatedBy CodePro at 10/12/11 9:00 AM
 *
 * @author epalaar
 *
 * @version $Revision$
 */
public class RectangleTest{

	@Test
	public void shouldComputeArea()
	{
		Rectangle theRectangle = new Rectangle(10,15);
		assertEquals(150.0, theRectangle.computeArea(),0.000001);
	}
	
	@Test
	public void shouldRenderDimensionOnBitMap()
	{
		Rectangle theRectangle = new Rectangle(10,15);
		Bitmap mockedBitmap = mock(Bitmap.class);
		theRectangle.render(mockedBitmap);
		verify(mockedBitmap).renderDimension("Dimension: length is 10.0, breadth is 15.0");
		
	}
	
	
}

	