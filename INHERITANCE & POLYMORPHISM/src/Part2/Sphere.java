package Part2;

public class Sphere extends Circle implements Figure{

	private int radius;
	
	public Sphere(int radius) {
		super(radius);
	}
	
	public double getSurfaceArea() {
		return 4 * Math.PI * this.radius * this.radius;
	
	}
}
