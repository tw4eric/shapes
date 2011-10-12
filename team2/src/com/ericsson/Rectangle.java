package com.ericsson;

public class Rectangle implements Shape
{

    private int width;
    private int height;
    
    
    public Rectangle(int width, int height)
    {
    	if(width<0 || height<0)
    		throw new IllegalArgumentException();
    	
        this.width  = width;
        this.height = height;
    }
    
   
    @Override
    public void render(Bitmap bitmap)
    {
        
        
    }


	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
}
