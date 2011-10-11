package shape;

public class Square implements Shape {

	private int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square draw : " + side * side);
	}

}
