package Part2;

public class Cube extends Square implements Figure {

	
	public Cube(int length) {
		super(length);
	}
	
	public double getSurfaceArea() {
		return super.getLength() * super.getLength() * 6;
	}
	
}
