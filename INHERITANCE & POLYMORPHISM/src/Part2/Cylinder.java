package Part2;

public class Cylinder extends Circle implements Figure {
	
	private int height;
	
	public Cylinder(int radius, int height) {
		super(radius);
		this.height = height;
	}
	
	
	public double getSurfaceArea() {
		
		return (2 * Math.PI * super.getRadius() * this.height)
				+ (Math.PI * Math.pow(super.getRadius(), 2));
	
	}

}




