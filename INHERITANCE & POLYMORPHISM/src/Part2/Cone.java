package Part2;

public class Cone extends Circle implements Figure{
	
	private int height;
	
	public Cone(int radius, int height) {
		super(radius);
		this.height = height;
	}
	
	public double getSurfaceArea() {
		return Math.PI * super.getRadius() * (Math.sqrt(Math.pow(this.height, 2) + Math.pow(super.getRadius(), 2)));
	}
	
	
}



