package shape;

public class Square implements Shape {

	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square draw : " + side * side);
	}

}
