package com.ericsson.agileTraining.examples;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

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

	@Test
	public void shouldRenderAreaInformationOnBitMap()
	{
		Rectangle theRectangle = new Rectangle(10,15);
		Bitmap mockedBitmap = mock(Bitmap.class);
		theRectangle.render(mockedBitmap);
		verify(mockedBitmap).renderArea("Area: 150.0");
	}
	
}

	