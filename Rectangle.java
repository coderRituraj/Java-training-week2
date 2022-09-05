package Assessment1;

public class Rectangle extends Shape {
	protected int length;
	protected int breadth;
	
	public Rectangle(int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}
	
	public double calculateArea() {
		return this.length*this.breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}
