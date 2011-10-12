package test.ericsson;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;

import com.ericsson.Bitmap;
import com.ericsson.Circle;
import com.ericsson.Rectangle;
import com.ericsson.Shape;


public class RectangleTest {
	 @Test(expected=IllegalArgumentException.class)
     public void shouldThrowIllegalArgumentExceptionForInvalidDimension()
     {
    	 Shape rectangle=new Rectangle(-1,2);
    	 Shape circle = new Circle(2);
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
	 @Test
	 public void shouldGetProperBitmapTextForArea(){
		 Shape rectangle=new Rectangle(2,2);
		 Bitmap bitmap = Mockito.mock(Bitmap.class);
		 rectangle.render(bitmap);
	Mockito.verify(bitmap).renderAreaAsText("Rectangle Area is :4.0");
	
	 }
	 
}
