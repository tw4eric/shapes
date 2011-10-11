package shape;

public class Circle implements Shape {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle Draw : " + Math.PI * radius * radius);
	}
}
