package Part2;

public class Cuboid extends Rectangle implements Figure {

	private int height;
	
	public Cuboid(int length, int width, int height) {
		super(length, width);
		this.height = height;
	}
	
	public double getSurfaceArea() {
		return super.getLength() * super.getWidth() * 4 + super.getWidth() * this.height;
	}
	
}
