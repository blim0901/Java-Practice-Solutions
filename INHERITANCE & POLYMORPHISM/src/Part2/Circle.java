package Part2;

public class Circle implements Shape {

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
}
