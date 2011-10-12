package com.ericsson.agileTraining.examples;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class SquareTest{

	@Test
	public void shouldComputeArea()
	{
		Square theSquare = new Square(10);
		assertEquals(100.0, theSquare.computeArea(),0.000001);
	}
	
	@Test
	public void shouldRenderDimensionOnBitMap()
	{
		Square theSquare = new Square(10);
		Bitmap mockedBitmap = mock(Bitmap.class);
		theSquare.render(mockedBitmap);
		verify(mockedBitmap).renderDimension("Dimension: side is 10.0");
	}

	@Test
	public void shouldRenderAreaInformationOnBitMap()
	{
		Square theSquare = new Square(10);
		Bitmap mockedBitmap = mock(Bitmap.class);
		theSquare.render(mockedBitmap);
		verify(mockedBitmap).renderArea("Area: 100.0");
	}
	
}

	