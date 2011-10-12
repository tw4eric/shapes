package com.ericsson;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.w3c.dom.css.Rect;


public class ShapeRendererTest
{
    @Test
    public void testGeneratedShapeObjects(){
        ShapeRenderer sr = new ShapeRenderer();
        List<Shape> generatedShapes = sr.generateShapes();
        
        Assert.assertEquals(generatedShapes.size(), 15);
    }
    
    public void testPrintFilteredShapes(){
        
        
    }
    
}
