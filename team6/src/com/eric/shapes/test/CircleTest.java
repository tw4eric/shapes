package com.eric.shapes.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.eric.shapes.Circle;
import com.eric.shapes.Shape;

public class CircleTest {

	@Test
	public void circleRadiusMustNotBeZero() {
		try {
			Shape circle = new Circle(0.0);
			circle.computeArea();
		} catch (IllegalArgumentException ie) {
			assertEquals("The radius cannot be zero", ie.getMessage());
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void circleRadiusShouldNotBeNegative() {
		Shape circle = new Circle(-10.0);
		circle.computeArea();
	}

	@Test
	public void testCircleArea() {
		Shape circle = new Circle(10.0);
		double calculatedArea = circle.computeArea();
		assertEquals(314.1592653589793, calculatedArea, 0);
	}
}
