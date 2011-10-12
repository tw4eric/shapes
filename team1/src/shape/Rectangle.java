package shape;

public class Rectangle implements Shape{

	private double height;
	private double width;

	public Rectangle(double height, double width) 
	{
		if(width <=0 || height <0)
			throw new IllegalArgumentException("dimension has to be non zero");
		this.width = width;
		this.height = height;
	}

	@Override
	public double computeArea() {
		return height*width;

	}
}
