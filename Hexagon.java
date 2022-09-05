package Assessment1;

public class Hexagon extends Shape{
	protected int HexagonSide;

	public Hexagon( int hexagonSide) {
		super("Hexagon");
		HexagonSide = hexagonSide;
	}

	protected int getHexagonSide() {
		return HexagonSide;
	}

	protected void setHexagonSide(int hexagonSide) {
		HexagonSide = hexagonSide;
	}

	public double HexagonArea()
	{
		return(3*Math.sqrt(3)*this.HexagonSide*this.HexagonSide)/2;
	}
	
	

}
