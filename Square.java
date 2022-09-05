package Assessment1;

public class Square extends Shape {
	protected int side;

	public Square(int side) {
		super("Square");
		this.side = side;
	}
	
	public double calculateArea() {
		return this.side*this.side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
}
