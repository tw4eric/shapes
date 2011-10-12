package test.ericsson;

import org.junit.Assert;
import org.junit.Test;

import com.ericsson.Rectangle;
import com.ericsson.Shape;


public class RectangleTest {
	 @Test(expected=IllegalArgumentException.class)
     public void shouldThrowIllegalArgumentExceptionForInvalidDimension()
     {
    	 Shape rectangle=new Rectangle(-1,2);
     }
	 @Test
     public void shouldNotThrowIllegalArgumentExceptionForValidDimension()
     {
    	 Shape rectangle=new Rectangle(2,2);
     }
	 @Test
     public void shouldReturnProperArea()
     {
    	 Shape rectangle=new Rectangle(2,2);
    	 Assert.assertEquals(4.0, rectangle.computeArea());
     }
}
