package com.ericsson;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {

	public RectangleTest(String name) {
		super(name);
	}

	public void testRectanglePositive() {
		try {
			new Rectangle(10, 20);
		} catch (Exception e) {
			fail("Excepion");
		}
	}

	public void testRectangleNegative() {
		try {
			new Rectangle(-10, 20);
		} catch (Exception e) {
			assertEquals(
					"Height and width of a rectangle should be greater than zero.", 
					e.getMessage());
		}
	}
}
