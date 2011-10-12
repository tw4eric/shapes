package com.ericsson.agileTraining.examples;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class CircleTest{

	@Test
	public void shouldComputeArea()
	{
		Circle theCircle = new Circle(10);
		assertEquals(314.0, theCircle.computeArea(),0.000001);
	}
	
	@Test
	public void shouldRenderDimensionOnBitMap()
	{
		Circle theCircle = new Circle(10);
		Bitmap mockedBitmap = mock(Bitmap.class);
		theCircle.render(mockedBitmap);
		verify(mockedBitmap).renderDimension("Dimension: Radius is 10.0");
	}

	@Test
	public void shouldRenderAreaInformationOnBitMap()
	{
		Circle theCircle = new Circle(10);
		Bitmap mockedBitmap = mock(Bitmap.class);
		theCircle.render(mockedBitmap);
		verify(mockedBitmap).renderArea("Area: 314.0");
	}
	
}

	